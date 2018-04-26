package com.example.zdroa.trainerapp.Database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = {Food.class, Exercise.class, CurrentGoals.class}, version = 2, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {

    public abstract CurrentGoalsDao currentGoalsDao();
    public abstract ExerciseDao exerciseDao();
    public abstract FoodDao foodDao();

}
