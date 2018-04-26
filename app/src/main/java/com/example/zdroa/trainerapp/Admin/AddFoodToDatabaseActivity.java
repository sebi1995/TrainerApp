package com.example.zdroa.trainerapp.Admin;

import android.arch.persistence.room.Room;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.zdroa.trainerapp.Database.AppDatabase;
import com.example.zdroa.trainerapp.Database.Food;
import com.example.zdroa.trainerapp.R;

import java.util.ArrayList;
import java.util.List;

public class AddFoodToDatabaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

        AppDatabase appDatabase = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class, "AppDatabase").build();
        final List<Food> foods = new ArrayList<>();

        AdminThread adminThread = new AdminThread(foods, appDatabase);
        adminThread.start();

        final EditText image = findViewById(R.id.etImage);
        final EditText name = findViewById(R.id.etName);
        final EditText calories = findViewById(R.id.etCalories);
        Button button = findViewById(R.id.btnAddFood);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Food food = new Food();
                food.setFood_image(image.getText().toString());
                food.setFood_name(name.getText().toString());
                food.setFood_calories(Integer.valueOf(calories.getText().toString()));

                synchronized (foods) {
                    foods.add(food);
                    foods.notify();
                }
            }
        });
    }
}

class AdminThread extends Thread {

    private final List<Food> foods;
    private AppDatabase appDatabase;

    AdminThread(List<Food> foods, AppDatabase appDatabase) {
        this.foods = foods;
        this.appDatabase = appDatabase;
    }

    @Override
    public void run() {
        while (true) {
            if (this.foods.size() != 0) {
                Food food = foods.remove(0);
                appDatabase.foodDao().insertAll(food);
            } else {
                synchronized (this.foods) {
                    try {
                        this.foods.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
