package com.cse486.cpc_nsu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class StudentLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_login);

        TextView tvStuSignUp = findViewById(R.id.tvStuSignUp);

        tvStuSignUp.setOnClickListener(v -> {
            startActivity(new Intent(StudentLogin.this, StudentSignup.class));
        });
    }
}