package com.example.zdroa.trainerapp.Database;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.RoomWarnings;

import java.util.List;

@Dao
interface CurrentGoalsDao {

    @Query("SELECT * FROM current_goals")
    List<CurrentGoals> getAll();

    @Query("SELECT * FROM current_goals WHERE goal_name LIKE :goal_name LIMIT 1")
    CurrentGoals findByGoalName(String goal_name);

    @Insert
    void insertAll(CurrentGoals... goals);

    @Delete
    void delete(CurrentGoals goal);
}
