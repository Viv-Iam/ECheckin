package com.innovach;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.innovach.echeckin.R;
import com.innovach.echeckin.ui.MyAdapter;

import java.util.ArrayList;

public class MPFTActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mpft);

        ListView list=(ListView)findViewById(R.id.listView);

        ArrayList<String> myData=new ArrayList<String>();

        myData.add("Abubakr Sadique Ali");
        myData.add("Albert Oketch");
        myData.add("Andrew Kimani");
        myData.add("Anita Nyamu");
        myData.add("Antony Gachau");
        myData.add("Apiut Toel");
        myData.add("Arafat Adan");
        myData.add("Ben Owino");
        myData.add("Brian Kemboi");
        myData.add("Burhan Ahmed");
        myData.add("Caroline Theuri");
        myData.add("Carolyne Milgo");
        myData.add("Charles Kakai");
        myData.add("Christine Wasike");
        myData.add("Collins Njau");
        myData.add("Daniel Kosgei");
        myData.add("David Adeola");
        myData.add("David Kahara");
        myData.add("David Mark");
        myData.add("David Waihenya");
        myData.add("Dennis Muturia");
        myData.add("Duncan Gichana");
        myData.add("Elvis Mogaka");
        myData.add("Emmanuel Mulatya");
        myData.add("Enok Mukhebi");
        myData.add("Eric Wanjohi");
        myData.add("Erick Mutua");
        myData.add("Esther Cheng'ole");
        myData.add("Firdaus Muhamad");
        myData.add("Gitu Mbugua");
        myData.add("Grace Njoroge");
        myData.add("Isaac Njuguna");
        myData.add("Joshua Kodhe");
        myData.add("Kelvin Kimathi");
        myData.add("Kelvin Wahome");
        myData.add("Kevin Matite");
        myData.add("Kevin Siundu");
        myData.add("Leroy Omondi");
        myData.add("Mandela Ngatia");
        myData.add("Martin Nyagah");
        myData.add("Miriam Njeri");
        myData.add("Moses Warachi");
        myData.add("Nathan Mumo");
        myData.add("Oyaro Job");
        myData.add("Peter Achacha");
        myData.add("Philkona Chiteri");
        myData.add("Samson Mwangi");
        myData.add("Samuel Barasa");
        myData.add("Samuel Ondoro");
        myData.add("Samuel Mutegi");
        myData.add("Tessa McDuffie");
        myData.add("Valentine Masicha");
        myData.add("Victor Ng'eno");
        myData.add("Wayne Mwandi");

// Now create adapter

        MyAdapter adapter=new MyAdapter(this, myData);

// NOw Set This Adapter to listview
        list.setAdapter(adapter);
    }
}
