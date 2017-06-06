package com.innovach.echeckin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;


public class MC2 extends AppCompatActivity {
    @Bind(R.id.mc2TextView) TextView mMc2TextView;
    @Bind(R.id.mc2ListView) ListView mMc2ListView;
    private String[] mc2names = new String[] {"Alex Kinuthia", "Brian Gathua", "Brian Marete", "Bry Onyoni", "Collins Mutuma", "Dickson Muli", "Joseph Kilasi", "Kenneth Gitere", "Minneh Mugo", "Morris Mburu", "Steve Kiarie", "Vivian Opondoh", "William Mbotela"  };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mc2);

        ButterKnife.bind(this);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, mc2names);
        mMc2ListView.setAdapter(adapter);
    }
    }

