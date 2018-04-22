package com.example.zdroa.trainerapp.Features;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.zdroa.trainerapp.R;

import java.util.Random;

public class Plans extends AppCompatActivity {
    LinearLayout plans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plans);

        plans = findViewById(R.id.TrainingPlanWindow);

    }

    public void previousScreen(View V){
        onBackPressed();

    }

    public void generatePlans(){
        Random random = new Random();
        for (int i = 0; i<=5; i++){
            LinearLayout l = (LinearLayout) getLayoutInflater().inflate(R.layout.trainingentry,null);
            TextView planNumber = l.findViewById(R.id.PlanNumber);
            plans.addView(l);
        }

    }
}
