package com.example.travlo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        if(! prefs.getBoolean("firstRun",false)){
            Intent i =new Intent(MainActivity.this,LoginActivity.class);
            startActivity(i);

            SharedPreferences.Editor editor = prefs.edit();
            editor.putBoolean("firstRun", true);
            editor.apply();
            finish();
        }

    }


}
