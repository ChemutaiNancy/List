package com.example.listapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String [] fruits = {"Apple", "Orange", "Peach", "Mango"};

        ListAdapter myadapter = new CustomAdapter(this, fruits);
        ListView mylistView = findViewById(R.id.myListView);
        mylistView.setAdapter(myadapter);

        mylistView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String fruit = String.valueOf(adapterView.getItemAtPosition(i));
                Toast.makeText(MainActivity.this, fruit, Toast.LENGTH_LONG).show();
            }
        });
    }

}
