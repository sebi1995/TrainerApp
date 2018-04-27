package com.example.zdroa.trainerapp.Features.Goals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.zdroa.trainerapp.R;

public class IndividualGoalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_individual_goal);

        Intent intent = this.getIntent();

        TextView image = findViewById(R.id.individual_goal_tv_image);
        TextView name = findViewById(R.id.individual_goal_tv_name);
        TextView calories = findViewById(R.id.individual_goal_tv_calories);

        image.setText(intent.getStringExtra("food_image"));
        name.setText(intent.getStringExtra("food_name"));
        calories.setText(intent.getStringExtra("food_calories"));
    }
}
