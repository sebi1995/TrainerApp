package com.example.zdroa.trainerapp.Database;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Index;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.widget.ListView;

import java.util.List;

@Dao
public interface FoodDao {

    @Query("SELECT * FROM foods")
    List<Food> getAll();

    @Query("SELECT * FROM foods WHERE food_name LIKE :food_name LIMIT 1")
    Food findByFoodName(String food_name);

    @Insert
    void insertAll(Food... foods);

    @Delete
    void delete(Food food);

}
