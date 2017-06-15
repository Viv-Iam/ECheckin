package com.innovach;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.innovach.echeckin.R;
import com.innovach.echeckin.ui.MyAdapter;

import java.util.ArrayList;

public class MC2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mc2);

        ListView list=(ListView)findViewById(R.id.listView);

        ArrayList<String> myData=new ArrayList<String>();

        myData.add("Alex Kinuthia");
        myData.add("Brian Gathua");
        myData.add("Brian Marete");
        myData.add("Bry Onyoni");
        myData.add("Collins Mutua");
        myData.add("Dickson Muli");
        myData.add("Joseph Kilasi");
        myData.add("Kenneth Gitere");
        myData.add("Minneh Mugo");
        myData.add("Morris Mburu");
        myData.add("Steve Kiarie");
        myData.add("Vivian Opondoh");
        myData.add("William Mbotela");

// Now create adapter

        MyAdapter adapter=new MyAdapter(this, myData);

// NOw Set This Adapter to listview
        list.setAdapter(adapter);
    }
}
