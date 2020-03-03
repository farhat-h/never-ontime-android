package com.alttab.never_ontime;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public static int DARK_THEME = R.style.DarkTheme;
    public static int LIGHT_THEME = R.style.LightTheme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        int theme = getIntent().getIntExtra("theme", LIGHT_THEME);
        setTheme(theme);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.themeButton);
        button.setOnClickListener((cl) -> {
            Intent intent = getIntent();
            intent.putExtra("theme", DARK_THEME);

            finish();
            overridePendingTransition(0,0);

            startActivity(intent);
            overridePendingTransition(0,0);

        });
    }
}
