package com.example.travlo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.common.SignInButton;

public class LoginActivity extends AppCompatActivity {
    private SignInButton gBtn;
    private Button fBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        gBtn = findViewById(R.id.google_sign_in_button);
        fBtn = findViewById(R.id.fBtn);

        gBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(LoginActivity.this, "Google btn", Toast.LENGTH_SHORT).show();
            }
        });

        fBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(LoginActivity.this, "Facebook btn", Toast.LENGTH_SHORT).show();
            }
        });




    }
}
