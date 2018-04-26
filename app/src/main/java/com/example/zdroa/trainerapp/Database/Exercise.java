package com.example.zdroa.trainerapp.Database;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.content.Intent;

import java.sql.Blob;

@Entity(tableName = "exercises")
public class Exercise {

    @PrimaryKey(autoGenerate = true)
    private int primaryKey;

    @ColumnInfo(name = "exercise_name")
    private String exercise_name;

    @ColumnInfo(name = "exercise_rating")
    private Integer exercise_rating;

    @ColumnInfo(name = "exercise_image")
    private String exercise_image;

    @ColumnInfo(name = "exercise_instructions")
    private String exercise_instructions;

    @ColumnInfo(name = "exercise_video")
    private String exercise_video;

    @ColumnInfo(name = "exercise_minimum_time")
    private Integer exercise_minimum_time;

    @ColumnInfo(name = "exercise_calories_burnt")
    private Integer exercise_calories_burnt;

    // getters
    // setters


    public void setPrimaryKey(int pKey) {
        this.primaryKey = pKey;
    }

    public int getPrimaryKey() {
        return primaryKey;
    }

    public String getExercise_image() {
        return exercise_image;
    }

    public void setExercise_calories_burnt(Integer exercise_calories_burnt) {
        this.exercise_calories_burnt = exercise_calories_burnt;
    }

    public Integer getExercise_calories_burnt() {
        return exercise_calories_burnt;
    }

    public void setExercise_image(String exercise_image) {
        this.exercise_image = exercise_image;
    }

    public Integer getExercise_minimum_time() {
        return exercise_minimum_time;
    }

    public void setExercise_instructions(String exercise_instructions) {
        this.exercise_instructions = exercise_instructions;
    }

    public Integer getExercise_rating() {
        return exercise_rating;
    }

    public void setExercise_minimum_time(Integer exercise_minimum_time) {
        this.exercise_minimum_time = exercise_minimum_time;
    }

    public String getExercise_instructions() {
        return exercise_instructions;
    }

    public void setExercise_name(String exercise_name) {
        this.exercise_name = exercise_name;
    }

    public String getExercise_name() {
        return exercise_name;
    }

    public void setExercise_rating(Integer exercise_rating) {
        this.exercise_rating = exercise_rating;
    }

    public String getExercise_video() {
        return exercise_video;
    }

    public void setExercise_video(String exercise_video) {
        this.exercise_video = exercise_video;
    }
}
