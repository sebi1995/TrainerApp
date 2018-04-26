package com.example.zdroa.trainerapp.Features;

import android.arch.persistence.room.Room;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.example.zdroa.trainerapp.Database.AppDatabase;
import com.example.zdroa.trainerapp.Database.Exercise;
import com.example.zdroa.trainerapp.Database.Food;
import com.example.zdroa.trainerapp.R;

import java.util.List;
import java.util.Random;

public class PlansActivity extends AppCompatActivity {
    ListView plans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plans);

        plans = findViewById(R.id.TrainingPlanWindow);

        generatePlans();

        plans.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
    }

    public void previousScreen(View V){
        this.finish();
    }

    public void generatePlans(){
        AppDatabase appDatabase = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class, "AppDatabase")
                //in case db breaks : fallbackToDestructiveMigration()
                .build();

        ListView lvFoodsListView = findViewById(R.id.lvFoodsInDB);

        //what does the user want? the exercise <-> diet scale number
        //is the user over 90kg? give him a harder diet
        List<Food> foods = appDatabase.foodDao().getAll();
        List<Exercise> exercises = appDatabase.exerciseDao().getAll();
//        exercises.get(0).



//        Random random = new Random();
//        for (int i = 0; i < 5; i++){
//            LinearLayout l = (LinearLayout) getLayoutInflater().inflate(R.layout.trainingentry,null);
//            TextView planNumber = l.findViewById(R.id.PlanNumber);
//            plans.addFooterView(l);
//            planNumber.setText(("Plan " + (1 + i)));
//        }

    }
}
