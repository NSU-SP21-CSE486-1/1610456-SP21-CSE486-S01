package com.cse486.assignment02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity01 extends AppCompatActivity {
    String fullName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login01);
        Context context = getApplicationContext();

        EditText etName = (EditText)  findViewById(R.id.eTfullName);
        Button btnNext = findViewById(R.id.btnNext);

        fullName = etName.getText().toString();

        btnNext.setOnClickListener(v -> {
            startActivity(new Intent(this, LoginActivity02.class));
        });
    }
}