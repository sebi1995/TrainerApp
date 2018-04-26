package com.example.zdroa.trainerapp.Admin;

import android.arch.persistence.room.Room;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.zdroa.trainerapp.Adaptor.CustomAdaptorForSeeingFoods;
import com.example.zdroa.trainerapp.Database.AppDatabase;
import com.example.zdroa.trainerapp.Database.Food;
import com.example.zdroa.trainerapp.R;

import java.util.ArrayList;
import java.util.List;

public class SeeFoodDataBaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_see_food_data_base);

        //thread to get populate the list
        innerThread innerThread = new innerThread();
        innerThread.start();

        //clear the list


    }

    public void btnToEnableClearDBButton(View view) {
        Button btnClearDB = findViewById(R.id.btnClearDB);
        btnClearDB.setEnabled(true);
        view.setEnabled(false);
    }

    class innerThread extends Thread {

        @Override
        public void run() {
            AppDatabase appDatabase = Room.databaseBuilder(getApplicationContext(),
                    AppDatabase.class, "AppDatabase")
                    //in case db breaks : fallbackToDestructiveMigration()
                    .build();

            ListView lvFoodsListView = findViewById(R.id.lvFoodsInDB);

            List<Food> foods = appDatabase.foodDao().getAll();

            CustomAdaptorForSeeingFoods customAdapter = new CustomAdaptorForSeeingFoods(getApplicationContext(), R.layout.itemlistrow, foods);

            lvFoodsListView.setAdapter(customAdapter);
        }
    }
}
