package com.innovach.echeckin.moringa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.innovach.echeckin.R;
import com.innovach.echeckin.moringa.moringagroups.MC2Activity;

import butterknife.Bind;
import butterknife.ButterKnife;

public class AdminMainActivity extends AppCompatActivity {
    @Bind(R.id.nameEditText) EditText mNameEditText;
    @Bind(R.id.mc2NameButton) Button mMc2NameButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_main);
        ButterKnife.bind(this);
        mMc2NameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = mNameEditText.getText().toString();
                Intent intent = new Intent(AdminMainActivity.this, MC2Activity.class);
                intent.putExtra("location", name);
                startActivity(intent);

            }
        });


    }
}
