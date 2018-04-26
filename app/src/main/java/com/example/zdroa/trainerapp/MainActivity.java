package com.example.zdroa.trainerapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.zdroa.trainerapp.Admin.AddFoodToDatabaseActivity;
import com.example.zdroa.trainerapp.Admin.SeeFoodDataBaseActivity;
import com.example.zdroa.trainerapp.Features.Goals.NewGoalActivity;
import com.example.zdroa.trainerapp.Features.GoalsActivity;
import com.example.zdroa.trainerapp.Features.PlansActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        SharedPreferences sharedPref;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        AppDatabase db = Room.databaseBuilder(getApplicationContext(),
//                AppDatabase.class, "AppDatabase").build();

//        UsersAsync usersAsync = new UsersAsync(db);
//        usersAsync.execute();

//
//         sharedPref = PreferenceManager.getDefaultSharedPreferences(this);
//         Boolean isInitialized = sharedPref.getBoolean("initialized",false);
//          if(!isInitialized)
//          {
//            Intent intent = new Intent(this, PersonalDataActivity.class);
//            startActivity(intent);
//          }

    }

    public void onButtonClick(View view) {
        switch (view.getId()) {
            case R.id.btn_ToGoals:
                startActivity(new Intent(getApplicationContext(), GoalsActivity.class));
                break;
            case R.id.btn_AddFood:
                startActivity(new Intent(getApplicationContext(), AddFoodToDatabaseActivity.class));
                break;

            case R.id.btn_ViewFood:
                startActivity(new Intent(getApplicationContext(), SeeFoodDataBaseActivity.class));
                break;

            case R.id.btn_Plans:
                startActivity(new Intent(getApplicationContext(), PlansActivity.class));
                break;

            case R.id.btn_NewGoal:
                startActivity(new Intent(getApplicationContext(), NewGoalActivity.class));
                break;
        }
    }
}
