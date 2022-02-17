package com.example.culinaryexperience;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText name_et;
    private Button main_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name_et = findViewById(R.id.name_et);
        main_btn = findViewById(R.id.main_btn);

        main_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                //to log out from app
//               logOut();
                openNextActivity();
            }
        });
    }

    //to logout from app
    private void logOut() {
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    private void openNextActivity() {
//        String sendName= name_et.getText().toString();
        Intent intent = new Intent(this, SecondActivity.class);
//        intent.putExtra("sendingName",sendName);
        startActivity(intent);
    }
}