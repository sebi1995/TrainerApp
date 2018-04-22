package com.example.zdroa.trainerapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        SharedPreferences sharedPref;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         sharedPref = PreferenceManager.getDefaultSharedPreferences(this);
         Boolean isInitialized = sharedPref.getBoolean("initialized",false);
          if(!isInitialized)
          {
            Intent intent = new Intent(this, PersonalDataActivity.class);
            startActivity(intent);
          }
    }
}
