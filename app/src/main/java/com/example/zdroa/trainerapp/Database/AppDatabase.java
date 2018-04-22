package com.example.zdroa.trainerapp.Database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = {Food.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
        public abstract UserDao userDao();
        public abstract FoodDao foodDao();

}
