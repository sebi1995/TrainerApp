package com.example.zdroa.trainerapp.Features;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.zdroa.trainerapp.R;

public class TodaysTaskActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todays_task);

        RadioGroup rg1 = findViewById(R.id.td_rbg1);
        final EditText minutes = findViewById(R.id.td_et_time);
        final EditText startTime = findViewById(R.id.td_et_time21);
        final EditText endTime = findViewById(R.id.td_et_time22);

        RadioGroup rg2 = findViewById(R.id.td_rbg2);
        final EditText burnedCalories = findViewById(R.id.td_et_calories);
        final TextView autoMessage = findViewById(R.id.td_tv_autoMsg);

        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.td_rb_yes1:
                        minutes.setVisibility(View.VISIBLE);
                        startTime.setVisibility(View.INVISIBLE);
                        endTime.setVisibility(View.INVISIBLE);
                        break;
                    case R.id.td_rb_no1:
                        startTime.setVisibility(View.VISIBLE);
                        endTime.setVisibility(View.VISIBLE);
                        minutes.setVisibility(View.INVISIBLE);
                        break;
                }
            }
        });

        rg2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.td_rb_yes2:
                        burnedCalories.setVisibility(View.VISIBLE);
                        autoMessage.setVisibility(View.INVISIBLE);
                        break;
                    case R.id.td_rb_no2:
                        autoMessage.setVisibility(View.VISIBLE);
                        burnedCalories.setVisibility(View.INVISIBLE);
                        break;
                }
            }
        });
    }
}
