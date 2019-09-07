package com.example.travlo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class LocationDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location_details);
        Intent intent = getIntent();
        String CityName = intent.getStringExtra("CityName");
        Toast.makeText(this, ""+CityName, Toast.LENGTH_SHORT).show();
    }
}
