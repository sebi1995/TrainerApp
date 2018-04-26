package com.example.zdroa.trainerapp.Database;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface ExerciseDao {

    @Query("SELECT * FROM exercises")
    List<Exercise> getAll();

    @Query("SELECT * FROM exercises WHERE exercise_name LIKE :exercise_name LIMIT 1")
    Exercise findByExerciseName(String exercise_name);

    @Insert
    void insertAll(Exercise... exercises);

    @Delete
    void delete(Exercise exercise);
}
