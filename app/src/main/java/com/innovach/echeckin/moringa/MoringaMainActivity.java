package com.innovach.echeckin.moringa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.innovach.echeckin.R;
import com.innovach.echeckin.moringa.moringagroups.MC2Activity;
import com.innovach.echeckin.moringa.moringagroups.MC3Activity;
import com.innovach.echeckin.moringa.moringagroups.MPFTActivity;
import com.innovach.echeckin.moringa.moringagroups.MPPTActivity;
import com.innovach.echeckin.qr.GeneratorActivity;
import com.innovach.echeckin.qr.ReaderActivity;
import com.innovach.echeckin.ui.MainActivity;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MoringaMainActivity extends AppCompatActivity {
    @Bind(R.id.mc2button) Button mMc2Button;
    @Bind(R.id.mc3button) Button mMc3Button;
    @Bind(R.id.mpft4button) Button mMpft4Button;
    @Bind(R.id.mpptbutton) Button mMpptButton;
    @Bind(R.id.qrscanbutton) Button mQrScanButton;
    @Bind(R.id.qrgenbutton) Button mQrGenButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moringa_main);

        ButterKnife.bind(this);

        mMc2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MoringaMainActivity.this, MC2Activity.class);
                startActivity(intent);
            }
        });

        mMc3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MoringaMainActivity.this, MC3Activity.class);
                startActivity(intent);
            }
        });

        mMpft4Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MoringaMainActivity.this, MPFTActivity.class);
                startActivity(intent);
            }
        });

        mMpptButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MoringaMainActivity.this, MPPTActivity.class);
                startActivity(intent);
            }
        });

        mQrScanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MoringaMainActivity.this, ReaderActivity.class);
                startActivity(intent);
            }
        });

        mQrGenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MoringaMainActivity.this, GeneratorActivity.class);
                startActivity(intent);
            }
        });
    }
}
