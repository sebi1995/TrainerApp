package com.example.zdroa.trainerapp.Database;

import android.arch.persistence.room.Room;
import android.os.AsyncTask;
import android.util.Log;

import java.util.List;

public class UsersAsync extends AsyncTask<Void, Void, Integer> {

    AppDatabase db;

    public UsersAsync(AppDatabase db) {
        this.db = db;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        Log.e("TASK: DB MOVE, STATUS: ", "CREATED DATABASE");
    }

    @Override
    protected Integer doInBackground(Void... voids) {
        Log.e("TASK: DB MOVE, STATUS: ", "STARTING TO ADD");

//        List<User> users = db.userDao().getAll();
//        for (User user : users) {
//            Log.i(db.toString(), user.getUid() + " " + user.getFirstName() + " " + user.getLastName());
//        }
//        db.close();
        return null;
    }

    @Override
    protected void onPostExecute(Integer integer) {
        super.onPostExecute(integer);
        Log.e("TASK: DB MOVE, STATUS: ", "FINISHED");
    }

}
