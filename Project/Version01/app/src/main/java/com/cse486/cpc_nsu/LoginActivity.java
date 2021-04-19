package com.cse486.cpc_nsu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button btnStudent = findViewById(R.id.btnStudent);
        Button btnManagement = findViewById(R.id.btnManagement);

        btnStudent.setOnClickListener(v -> {
            startActivity(new Intent(LoginActivity.this,StudentLogin.class));
        });

        btnManagement.setOnClickListener(v -> {
            startActivity(new Intent(LoginActivity.this, ManagementLogin.class));
        });
    }
}