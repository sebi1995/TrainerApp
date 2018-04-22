package com.example.zdroa.trainerapp;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class PersonalDataActivity extends AppCompatActivity {

    SharedPreferences preferences;
    Spinner dropdown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_data);


        dropdown =  findViewById(R.id.spinner_gender);
        String[] items = new String[]{"Gender ", "Male", "Female"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
        dropdown.setAdapter(adapter);

    }

    public void save(View v)
    {

        TextView name = findViewById(R.id.pd_tv_name);
        EditText etAge = findViewById(R.id.pd_et_age);
        EditText etWeight = findViewById(R.id.pd_et_weight);
        EditText etHeight = findViewById(R.id.pd__et_height);

        preferences = PreferenceManager.getDefaultSharedPreferences(this);

        SharedPreferences.Editor editor = preferences.edit();
        if(name.getText().toString().matches("([a-z]|[A-Z])+") == true)
        {
            try {
                editor.putString("Name", name.getText().toString());
            } catch (NumberFormatException e) {
                Toast toast = Toast.makeText(this, "Numele nu este valid.", Toast.LENGTH_SHORT);
                toast.show();
            }
        }
        else
        {
            Toast toast = Toast.makeText(this, "Introduceti un nume valid.", Toast.LENGTH_SHORT);
            toast.show();
        }

        try {
            if (Integer.parseInt(etAge.getText().toString()) > 14 && Integer.parseInt(etAge.getText().toString()) < 60) {
                Integer age = Integer.parseInt(etAge.getText().toString());
                editor.putInt("Age", age);

            } else {
                Toast toast = Toast.makeText(this, "Introduceti o varsta valida.", Toast.LENGTH_SHORT);
                toast.show();
            }
        }catch(NumberFormatException e)
        {
            Toast toast = Toast.makeText(this, "Varsta introdusa nu este valida.", Toast.LENGTH_SHORT);
            toast.show();
        }

        if(dropdown.getSelectedItem().equals("Gender"))
        {
            Toast toast = Toast.makeText(this, "Selectie invalida.", Toast.LENGTH_SHORT);
            toast.show();
        }
        else
        {
            try
            {
                String gender = (String) dropdown.getSelectedItem();
            }catch(NumberFormatException e)
            {
                Toast toast = Toast.makeText(this, "Selectie invalida.", Toast.LENGTH_SHORT);
                toast.show();
            }
        }

        try {
            if (Float.valueOf(etWeight.getText().toString()) > 50 && Float.valueOf(etWeight.getText().toString()) < 200) {
                Float weight = Float.valueOf(etWeight.getText().toString());
                editor.putFloat("Weight", weight);
            } else {
                Toast toast = Toast.makeText(this, "Greutate invalida.", Toast.LENGTH_SHORT);
                toast.show();
            }
        }catch (NumberFormatException e)
        {
            Toast toast = Toast.makeText(this, "Greutate invalida.", Toast.LENGTH_SHORT);
            toast.show();
        }

        try {
            if (Float.valueOf(etHeight.getText().toString()) > 120 && Float.valueOf(etHeight.getText().toString()) < 230) {
                Float height = Float.valueOf(etHeight.getText().toString());
                editor.putFloat("Height", height);
            } else {
                Toast toast = Toast.makeText(this, "Inaltime invalida.", Toast.LENGTH_SHORT);
                toast.show();
            }
        }catch (NumberFormatException e)
        {
            Toast toast = Toast.makeText(this, "Inaltime invalida.", Toast.LENGTH_SHORT);
            toast.show();
        }
        editor.apply();
    }

}
