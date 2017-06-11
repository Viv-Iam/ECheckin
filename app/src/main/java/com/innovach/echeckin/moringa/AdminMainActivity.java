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
import com.innovach.echeckin.moringa.moringagroups.MC2Activity;
import com.innovach.echeckin.moringa.moringagroups.MC3Activity;

import butterknife.Bind;
import butterknife.ButterKnife;

import static android.R.attr.name;

public class AdminMainActivity extends AppCompatActivity implements View.OnClickListener {
    private DatabaseReference mAddedNameReference;
    @Bind(R.id.nameEditText) EditText mNameEditText;
    @Bind(R.id.mc2NameButton) Button mMc2NameButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        mAddedNameReference = FirebaseDatabase.getInstance().getReference().child(Constants.FIREBASE_CHILD_ADDED_NAME);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_main);
        ButterKnife.bind(this);
        mMc2NameButton.setOnClickListener(this);
    }

    @Override
            public void onClick(View v) {
                if(v == mMc2NameButton) {
                    String name = mNameEditText.getText().toString();
                    saveNameToFirebase(name);
                    Intent intent = new Intent(AdminMainActivity.this, MC2Activity.class);
                    intent.putExtra("name", name);
                    startActivity(intent);
                }

            }
            public void saveNameToFirebase(String name) {
            mAddedNameReference.setValue(name);
        }
}
