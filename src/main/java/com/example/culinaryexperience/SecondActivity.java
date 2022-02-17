package com.example.culinaryexperience;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView userName_tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        userName_tv = findViewById(R.id.userName_tv);

        Intent intent= getIntent();
        String nameOfUser= intent.getStringExtra("sendingName");
        userName_tv.setText(nameOfUser);

    }
}