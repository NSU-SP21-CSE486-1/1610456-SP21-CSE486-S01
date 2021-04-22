package com.cse486.assignment02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class LoginActivity07 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login07);

        Button btnNext = findViewById(R.id.btnNext);
        Button btnPrevious = findViewById(R.id.btnPrevious);

        btnPrevious.setOnClickListener(v -> {
            startActivity(new Intent(this, LoginActivity06.class));
        });

        btnNext.setOnClickListener(v -> {
            startActivity(new Intent(this, LoginActivity08.class));
        });
    }
}