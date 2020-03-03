package com.alttab.never_ontime;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.alttab.never_ontime.util.UIManager;


public class MainActivity extends AppCompatActivity {
    private UIManager uiManager = UIManager.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        int theme = getIntent().getIntExtra("theme", UIManager.LIGHT_THEME);
        uiManager.setStatusBarColor(this, theme);
        setTheme(theme);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.themeButton);
        button.setOnClickListener((cl) -> {
            Intent intent = getIntent();
            intent.putExtra("theme", UIManager.DARK_THEME);

            finish();
            overridePendingTransition(0, 0);

            startActivity(intent);
            overridePendingTransition(0, 0);

        });
    }
}
