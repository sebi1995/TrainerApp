package com.example.zdroa.trainerapp.Database;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import java.sql.Blob;
import java.sql.Date;

@Entity(tableName = "current_goals")
public class CurrentGoals {

    CurrentGoals(Integer primaryKey, String goal_name, String goal_food_name, String goal_exercise_name,
                 String goal_end_date, String goal_progress, String goal_start_date){
    }

    @PrimaryKey(autoGenerate = true)
    private Integer primaryKey;

    @ColumnInfo(name = "goal_name")
    private String goal_name;

    @ColumnInfo(name = "goal_start_date")
    private String goal_start_date;

    @ColumnInfo(name = "goal_end_date")
    private String goal_end_date;

    @ColumnInfo(name = "goal_progress")
    private String goal_progress;//expired, in progress, completed

    @ColumnInfo(name = "goal_food_name")
    private String goal_food_name;

    @ColumnInfo(name = "goal_exercise_name")
    private String goal_exercise_name;

    // getters
    // setters


    public void setPrimaryKey(Integer primaryKey) {
        this.primaryKey = primaryKey;
    }

    public Integer getPrimaryKey() {
        return primaryKey;
    }

    public String getGoal_end_date() {
        return goal_end_date;
    }

    public void setGoal_end_date(String goal_end_date) {
        this.goal_end_date = goal_end_date;
    }

    public String getGoal_start_date() {
        return goal_start_date;
    }

    public void setGoal_exercise_name(String goal_exercise) {
        this.goal_exercise_name = goal_exercise;
    }

    public String getGoal_exercise_name() {
        return goal_exercise_name;
    }

    public void setGoal_food_name(String goal_food) {
        this.goal_food_name = goal_food;
    }

    public String getGoal_food_name() {
        return goal_food_name;
    }

    public void setGoal_name(String goal_name) {
        this.goal_name = goal_name;
    }

    public String getGoal_name() {
        return goal_name;
    }

    public void setGoal_progress(String goal_progress) {
        this.goal_progress = goal_progress;
    }

    public String getGoal_progress() {
        return goal_progress;
    }

    public void setGoal_start_date(String goal_start_date) {
        this.goal_start_date = goal_start_date;
    }
}

