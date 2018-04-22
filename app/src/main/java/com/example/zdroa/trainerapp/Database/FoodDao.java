package com.example.zdroa.trainerapp.Database;

import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Index;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

public interface FoodDao {

    @Query("SELECT * FROM food")
    List<Food> getAll();

    @Query("SELECT * FROM food WHERE food_name LIKE :food_name LIMIT 1")
    Food findByFoodName(String food_name);

    @Insert
    void insertAll(Food... foods);

    @Delete
    void delete(Food food);

}
