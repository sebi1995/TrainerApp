package com.example.zdroa.trainerapp.Features;

import android.arch.persistence.room.Room;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.zdroa.trainerapp.Adaptor.CustomAdaptorForSeeingFoods;
import com.example.zdroa.trainerapp.Database.AppDatabase;
import com.example.zdroa.trainerapp.Database.Exercise;
import com.example.zdroa.trainerapp.Database.Food;
import com.example.zdroa.trainerapp.Features.Goals.IndividualGoalActivity;
import com.example.zdroa.trainerapp.R;

import java.util.ArrayList;
import java.util.List;

public class GoalsActivity extends AppCompatActivity {

    List<Food> foods;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goals);

        listView = findViewById(R.id.goals_lv_goals);

        new GetFoods().execute();

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), IndividualGoalActivity.class);

                intent.putExtra("food_name", foods.get(position).getFood_name());
                intent.putExtra("food_image", foods.get(position).getFood_image());
                intent.putExtra("food_calories", String.valueOf(foods.get(position).getFood_calories()));

                startActivity(intent);
            }
        });
    }

    class GetFoods extends AsyncTask {

        @Override
        protected Object doInBackground(Object[] objects) {
            AppDatabase appDatabase = Room.databaseBuilder(getApplicationContext(),
                    AppDatabase.class, "AppDatabase")
                    //in case db breaks : fallbackToDestructiveMigration()
                    .build();

            foods = appDatabase.foodDao().getAll();
            CustomAdaptorForSeeingFoods adaptor = new CustomAdaptorForSeeingFoods(getApplicationContext(), R.layout.itemlistrow, foods);
            listView.setAdapter(adaptor);

            return foods;
        }
    }
}
