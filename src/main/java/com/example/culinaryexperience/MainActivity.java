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

    private Button main_btn;
    private Button starters_btn;
    private Button fish_btn;
    private Button winged_creatures_btn;
    private Button meat;
    private Button vegan_vegetarian_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        main_btn = findViewById(R.id.main_btn);
        starters_btn = findViewById(R.id.starters_btn);
        fish_btn = findViewById(R.id.fish_btn);
        winged_creatures_btn = findViewById(R.id.winged_creatures_btn);
        meat = findViewById(R.id.meat_btn);
        vegan_vegetarian_btn = findViewById(R.id.vegan_vegetarian_btn);

        main_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                //to log out from app
               logOut();
            }
        });

        starters_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFStartersActivity();
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

    private void openFStartersActivity() {
        Intent intent = new Intent(this, StartersActivity.class);
        startActivity(intent);
    }
//    private void openFishActivity() {
//        Intent intent = new Intent(this, FishActivity.class);
//        startActivity(intent);
//    }
//    private void openWingedCreaturesActivity() {
//        Intent intent = new Intent(this, WingedActivity.class);
//        startActivity(intent);
//    }
//    private void openMeatActivity() {
//        Intent intent = new Intent(this, MeatActivity.class);
//        startActivity(intent);
//    }
//    private void openVeganVegetarianActivity() {
//        Intent intent = new Intent(this, VeganVegetarianActivity.class);
//        startActivity(intent);
//    }
}