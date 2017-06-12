package com.innovach.echeckin.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.innovach.echeckin.R;

import butterknife.Bind;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    @Bind(R.id.registerTextView) TextView mRegisterTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
}
