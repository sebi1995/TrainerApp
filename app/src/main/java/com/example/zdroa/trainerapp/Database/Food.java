package com.example.zdroa.trainerapp.Database;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import java.sql.Blob;

@Entity(tableName = "foods")
public class Food {

    @PrimaryKey(autoGenerate = true)
    private Integer foodPrimaryKey;

    @ColumnInfo(name = "food_image")
    private String food_image;


    @ColumnInfo(name = "food_name")
    private String food_name;


    @ColumnInfo(name = "food_calories")
    private Integer food_calories;
    //setters and getters

    //
    /////////////////////////

    public void setFood_image(String food_image) {
        this.food_image = food_image;
    }

    public String getFood_image() {
        return food_image;
    }

    public void setFood_name(String food_name) {
        this.food_name = food_name;
    }

    public String getFood_name() {
        return food_name;
    }

    public void setFood_calories(Integer food_calories) {
        this.food_calories = food_calories;
    }

    public Integer getFood_calories() {
        return food_calories;
    }

    public Integer getFoodPrimaryKey() {
        return foodPrimaryKey;
    }

    public void setFoodPrimaryKey(Integer foodPrimaryKey) {
        this.foodPrimaryKey = foodPrimaryKey;
    }
}
