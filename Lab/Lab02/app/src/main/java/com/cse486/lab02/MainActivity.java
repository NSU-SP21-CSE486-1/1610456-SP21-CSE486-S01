package com.cse486.lab02;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("lifecycle","onCreate method triggered");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("lifecycle","onStart method triggered");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("lifecycle","onResume method triggered");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("lifecycle","onPause method triggered");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("lifecycle","onStop method triggered");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("lifecycle","onRestart method triggered");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("lifecycle","onDestroy method triggered");
    }

}