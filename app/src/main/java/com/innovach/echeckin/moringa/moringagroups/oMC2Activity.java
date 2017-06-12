package com.innovach.echeckin.moringa.moringagroups;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

//import com.firebase.client.Firebase;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.innovach.echeckin.R;

import java.util.ArrayList;


public class oMC2Activity extends AppCompatActivity {
    private DatabaseReference mRef;
    private ListView mListView;
    private ArrayList<String> mMC2name;

//    ArrayList<Name> mNames;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_omc2);
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        mRef = database.getReference("https://mobilecheck-in-38380.firebaseio.com/MC2Names");

//        mRef = new Firebase("https://mobilecheck-in-38380.firebaseio.com/MC2Names");
        mListView = (ListView) findViewById(R.id.listView);
        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mMC2name);
        mListView.setAdapter(arrayAdapter);

        mRef.addChildEventListener(new ChildEventListener(){

            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {

                String value = dataSnapshot.getValue(String.class);
                mMC2name.add(value);
                arrayAdapter.notifyDataSetChanged();

            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {


            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {


            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {


            }

            @Override
            public void onCancelled(DatabaseError databaseError) {}

        });
    }
}