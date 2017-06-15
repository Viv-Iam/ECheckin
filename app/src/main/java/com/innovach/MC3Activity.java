package com.innovach;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.innovach.echeckin.R;
import com.innovach.echeckin.ui.MyAdapter;

import java.util.ArrayList;

public class MC3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mc3);
        ListView list=(ListView)findViewById(R.id.listView);

        ArrayList<String> myData=new ArrayList<String>();

        myData.add("Abdulmajid Osman");
        myData.add("Andrew Wachira");
        myData.add("Anthony Shikanga")
        myData.add("Betty Mutai");
        myData.add("Brian Ontiri");
        myData.add("Bryan Memeti");
        myData.add("Chris Nyaga");
        myData.add("Deborah Nasireyi");
        myData.add("Dennis Kimani");
        myData.add("Edward Mudaida");
        myData.add("George Karanu");
        myData.add("Issac Onyango");
        myData.add("Kelvin Munene");
        myData.add("Kiplagat Tonui");
        myData.add("Lewis Nyoike");
        myData.add("MohammedAmin Shariff Awo");
        myData.add("Newton Kiragu");
        myData.add("Paul Nderitu");
        myData.add("Philip Mutua");
        myData.add("Samwel Kinuthia");
        myData.add("Victor Kibet");
        myData.add("Victor Allen");




// Now create adapter

        MyAdapter adapter=new MyAdapter(this, myData);

// NOw Set This Adapter to listview
        list.setAdapter(adapter);
    }
}

