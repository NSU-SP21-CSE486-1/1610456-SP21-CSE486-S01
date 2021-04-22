package com.example.android.hellosharedpreefs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

public class SettingActivity extends AppCompatActivity {

    int mCount;
    int mColor;
    private SharedPreferences mPreferences;
    // Key for current count
    private final String COUNT_KEY = "count";
    // Key for current color
    private final String COLOR_KEY = "color";
    private String sharedPrefFile = "com.example.android.hellosharedpreefs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        mCount = getIntent().getIntExtra("count",0);
        mColor = getIntent().getIntExtra("color", 0);

        mPreferences = getSharedPreferences(sharedPrefFile, MODE_PRIVATE);


    }
    public void reset(View view) {
        // Reset count
        mCount = 0;

        // Reset color
        mColor = ContextCompat.getColor(this,
                R.color.default_background);

        // Clear preferences
        SharedPreferences.Editor preferencesEditor = mPreferences.edit();
        preferencesEditor.clear();
        preferencesEditor.apply();
    }

    public void save_button(View view) {
        SharedPreferences.Editor preferencesEditor = mPreferences.edit();

        // Restore preferences
        mCount = mPreferences.getInt(COUNT_KEY, mCount);
        mColor = mPreferences.getInt(COLOR_KEY, mColor);

        preferencesEditor.apply();

    }
}