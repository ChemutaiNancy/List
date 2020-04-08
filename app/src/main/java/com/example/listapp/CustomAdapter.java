package com.example.listapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

class CustomAdapter extends ArrayAdapter<String> {
    public CustomAdapter(@NonNull Context context, String [] fruits) {
        super(context, R.layout.custom_row, fruits);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater myinflator = LayoutInflater.from(getContext());
        View customView = myinflator.inflate(R.layout.custom_row, parent,false);

        String singlefruititem = getItem(position);
        TextView mytext = customView.findViewById(R.id.txtFruit);
        ImageView myimagge = customView.findViewById(R.id.imgApple);
        //set image & text
        mytext.setText(singlefruititem);
        myimagge.setImageResource(R.drawable.apple);

        return customView;
    }
}
