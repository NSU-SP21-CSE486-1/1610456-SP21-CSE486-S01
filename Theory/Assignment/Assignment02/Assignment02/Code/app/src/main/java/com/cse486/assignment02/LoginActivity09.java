package com.cse486.assignment02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class LoginActivity09 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login09);
        Context context = getApplicationContext();

        Button btnSave = findViewById(R.id.btnSave);
        Button btnPrevious = findViewById(R.id.btnPrevious);

        btnPrevious.setOnClickListener(v -> {
            startActivity(new Intent(this, LoginActivity08.class));
        });

        btnSave.setOnClickListener(v -> {
            startActivity(new Intent(this, MainActivity.class));
        });

    }
}