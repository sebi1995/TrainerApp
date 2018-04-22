package com.example.zdroa.trainerapp;

import android.arch.persistence.room.Room;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.zdroa.trainerapp.Database.AppDatabase;
import com.example.zdroa.trainerapp.Database.UsersAsync;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        SharedPreferences sharedPref;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Intent intent = new Intent(this, TodaysTaskActivity.class);
//        startActivity(intent);

//        AppDatabase db = Room.databaseBuilder(getApplicationContext(),
//                AppDatabase.class, "AppDatabase").build();

//        UsersAsync usersAsync = new UsersAsync(db);
//        usersAsync.execute();


         sharedPref = PreferenceManager.getDefaultSharedPreferences(this);
         Boolean isInitialized = sharedPref.getBoolean("initialized",false);
          if(!isInitialized)
          {
            Intent intent = new Intent(this, PersonalDataActivity.class);
            startActivity(intent);
          }
    }
}
