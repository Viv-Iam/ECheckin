package com.innovach.echeckin.moringa.moringagroups;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.innovach.echeckin.R;
import com.innovach.echeckin.adapter.NameListAdapter;
import com.innovach.echeckin.moringa.Name;

import java.util.ArrayList;

public class MC2Activity extends AppCompatActivity {
    ArrayList<Name> mNames;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mc2);

        RecyclerView rvContacts = (RecyclerView) findViewById(R.id.recyclerView);

        // Initialize contacts
        mNames = Name.createContactsList(13);
        // Create adapter passing in the sample user data
        NameListAdapter adapter = new NameListAdapter(this, mNames);
        // Attach the adapter to the recyclerview to populate items
        rvContacts.setAdapter(adapter);
        // Set layout manager to position the items
        rvContacts.setLayoutManager(new LinearLayoutManager(this));
    }
}
