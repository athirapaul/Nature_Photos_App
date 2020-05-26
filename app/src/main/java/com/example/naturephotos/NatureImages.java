package com.example.naturephotos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class NatureImages extends AppCompatActivity {
GridView gridLayout;
String[] ImageTypes = {"Flowers","Mountains","Sunset","Waterfalls","Spring","Snow","Stones","Clouds"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nature_images);

        gridLayout = (GridView)findViewById(R.id.GridLayoutId);

    }





}
