package com.innovach.echeckin.moringa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.innovach.echeckin.Constants;
import com.innovach.echeckin.R;
import com.innovach.echeckin.moringa.moringagroups.oMC2Activity;

import butterknife.Bind;
import butterknife.ButterKnife;


public class AdminMainActivity extends AppCompatActivity implements View.OnClickListener {

    //Assigns different nodes on firebase for easy referencing
    private DatabaseReference mMC2NamesReference;
    private DatabaseReference mMC3NamesReference;

    //Bind different views locating them by their ids
    @Bind(R.id.namesEditText) EditText mNamesEditText;
    @Bind(R.id.mc2Button) Button mMc2Button;
    @Bind(R.id.mc3Button) Button mMc3Button;

    //Overrides onCreate()
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    //path for accessing different nodes using child name assigned in Constans.java
        mMC2NamesReference = FirebaseDatabase.getInstance().getReference().child(Constants.FIREBASE_CHILD_MC2_NAMES);
        mMC3NamesReference = FirebaseDatabase.getInstance().getReference().child(Constants.FIREBASE_CHILD_MC3_NAMES);

        super.onCreate(savedInstanceState);
    //indicates the layout to show on the AdminMainActivity.java
        setContentView(R.layout.activity_admin_main);
    //calls the different views we binded above
        ButterKnife.bind(this);
    //sets onClick listener for our various buttons
        mMc2Button.setOnClickListener(this);
        mMc3Button.setOnClickListener(this);
    }
    //Overrides onClick()
    @Override
            public void onClick(View v) {
    //Specifies action upon click of mc2Button
                if(v == mMc2Button) {
                    String name = mNamesEditText.getText().toString();
                    saveMc2ToFirebase(name);
                    Intent intent = new Intent(AdminMainActivity.this, AdminMainActivity.class);
                    intent.putExtra("name", name);
                    startActivity(intent);
                }
        //Specifies action upon click of mc3Button
        if(v == mMc3Button) {
            String name1 = mNamesEditText.getText().toString();
            saveMc3ToFirebase(name1);
            Intent intent = new Intent(AdminMainActivity.this, oMC2Activity.class);
            intent.putExtra("name", name1);
            startActivity(intent);
        }

            }
            //Adds data under MC2Names node on firebase
            public void saveMc2ToFirebase(String name) {
            mMC2NamesReference.push().setValue(name);
        }
        //Adds data under MC3Names node on firebase
    public void saveMc3ToFirebase(String name) {
        mMC3NamesReference.push().setValue(name);
    }
}
