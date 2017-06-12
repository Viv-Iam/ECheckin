package com.innovach.echeckin.moringa.moringagroups;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;
import com.innovach.echeckin.R;



public class oMPFTActivity extends AppCompatActivity {
    private TextView mValueView;
    private Firebase mRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ompft);

        mValueView = (TextView) findViewById(R.id.textView);
        mRef = new Firebase("https://mobilecheck-in-38380.firebaseio.com/MC2Names");
        mRef.addValueEventListener(new ValueEventListener(){

            @Override
            public void onDataChange(com.firebase.client.DataSnapshot dataSnapshot) {
                String value =  dataSnapshot.getValue(String.class);
                mValueView.setText(value);


            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
    }
}
