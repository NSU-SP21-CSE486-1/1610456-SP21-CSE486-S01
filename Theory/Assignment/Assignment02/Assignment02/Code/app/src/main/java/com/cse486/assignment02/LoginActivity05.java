package com.cse486.assignment02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class LoginActivity05 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login05);

        Button btnNext = findViewById(R.id.btnNext);
        Button btnPrevious = findViewById(R.id.btnPrevious);

        btnPrevious.setOnClickListener(v -> {
            startActivity(new Intent(this, LoginActivity04.class));
        });

        btnNext.setOnClickListener(v -> {
            startActivity(new Intent(this, LoginActivity06.class));
        });
    }
}