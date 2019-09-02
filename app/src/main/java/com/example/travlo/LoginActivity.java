package com.example.travlo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Toast.makeText(this, "hiiii", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "second HII", Toast.LENGTH_SHORT).show();

    }
}
