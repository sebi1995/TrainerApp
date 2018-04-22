package com.example.zdroa.trainerapp.Database;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;

import java.sql.Blob;

@Entity
public class Food {

    @ColumnInfo(name = "food_image")
    private Blob food_image;


    @ColumnInfo(name = "food_name")
    private String food_name;

    //setters and getters
    //
    /////////////////////////

    public void setFood_image(Blob food_image) {
        this.food_image = food_image;
    }

    public void setFood_name(String food_name) {
        this.food_name = food_name;
    }

    public Blob getFood_image() {
        return food_image;
    }

    public String getFood_name() {
        return food_name;
    }
}
