package com.innovach.echeckin.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.innovach.echeckin.R;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import static android.R.attr.visible;

/**
 * Created by vivian on 14/06/17.
 */

public class MyAdapter extends ArrayAdapter<String> {
    // This is constructor for MyAdapter

    public MyAdapter(Context context, ArrayList<String> records)
    {
        super(context, 0, records);
    }

    @Override
    // This is important method : You can write your own code in this function
    // You can set your textview/ button methods :
    public View getView(int position, View convertView, ViewGroup parent) {

        // Get the data item for this position
        String item = getItem(position);

        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.listview_custom, parent, false);
        }

        final TextView list_Txt=(TextView)convertView.findViewById(R.id.List_txt);
        final Button list_But=(Button)convertView.findViewById(R.id.List_But);
        final Button list_But1=(Button)convertView.findViewById(R.id.List_But1);
        final TextView txtCTime=(TextView)convertView.findViewById(R.id.txtShowCurTime);

        list_Txt.setText(item);
        list_But.setVisibility(1);
        txtCTime.setInputType(InputType.TYPE_NULL);
        list_But.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // It will change textview text :
                txtCTime.setText(new Date().toString());
                list_But.setVisibility(View.GONE);
                list_But1.setVisibility(View.VISIBLE);

//                list_Txt.setText("CHEKED-IN");


            }
        });

        return convertView;
    }
}