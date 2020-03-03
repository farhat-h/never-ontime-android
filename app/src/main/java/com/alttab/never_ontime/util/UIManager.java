package com.alttab.never_ontime.util;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import androidx.core.content.ContextCompat;

import com.alttab.never_ontime.R;

public class UIManager {
    private static UIManager instance;
    public static int DARK_THEME = R.style.DarkTheme;
    public static int LIGHT_THEME = R.style.LightTheme;

    public static UIManager getInstance() {
        if (instance == null) {
            instance = new UIManager();
        }
        return instance;
    }

    private UIManager() {
    }

    public void setStatusBarColor(Activity activity, int theme) {
        Window w = activity.getWindow();
        w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        int color;
        if (theme == DARK_THEME)
            color = R.color.dark_background;
        else {

            color = R.color.light_background;
            w.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);//  set status text dark
        }

        w.setStatusBarColor(ContextCompat.getColor(activity, color));

    }
}
