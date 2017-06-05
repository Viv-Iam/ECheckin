package com.innovach.echeckin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @Bind(R.id.mc2button) Button mMc2Button;
    @Bind(R.id.mc3button) Button mMc3Button;
    @Bind(R.id.mpft4button) Button mMpft4Button;
    @Bind(R.id.mpptbutton) Button mMpptButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mMc2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MC2.class);
                startActivity(intent);
            }
        });

        mMc3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MC3.class);
                startActivity(intent);
            }
        });

        mMpft4Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MPFT4.class);
                startActivity(intent);
            }
        });

        mMpptButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MPPT.class);
                startActivity(intent);
            }
        });
    }
}