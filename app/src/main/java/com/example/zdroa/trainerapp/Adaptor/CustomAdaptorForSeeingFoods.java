package com.example.zdroa.trainerapp.Adaptor;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.zdroa.trainerapp.Database.Food;
import com.example.zdroa.trainerapp.Database.FoodDao;
import com.example.zdroa.trainerapp.R;

import java.util.List;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.L;

public class CustomAdaptorForSeeingFoods extends ArrayAdapter<Food> {

    public CustomAdaptorForSeeingFoods(Context context, int textViewResourceId) {
        super(context, textViewResourceId);
    }

    public CustomAdaptorForSeeingFoods(Context context, int resource, List<Food> items) {
        super(context, resource, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = convertView;

        if (view == null) {
            LayoutInflater vi;
            vi = LayoutInflater.from(getContext());
            view = vi.inflate(R.layout.itemlistrow, null);
        }

        Food food = getItem(position);

        if (food != null) {
            TextView tvFoodImage = view.findViewById(R.id.tvFoodImage);
            TextView tvFoodName = view.findViewById(R.id.tvFoodName);
            TextView tvFoodCalories = view.findViewById(R.id.tvFoodCalories);

            if (tvFoodImage != null) {
                tvFoodImage.setText(food.getFood_image());
            }

            if (tvFoodName != null) {
                tvFoodName.setText(food.getFood_name());
            }

            if (tvFoodCalories != null) {
                Log.e("Tag: " , "at calories");
                tvFoodCalories.setText(food.getFood_calories()+"");
            }
        }

        return view;
    }

}
