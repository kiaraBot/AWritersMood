package com.example.awritersmood.ui.newboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.awritersmood.R;

public class ThemeActivity extends AppCompatActivity {
    private ImageButton ib_ta_theme1;
    private ImageButton ib_ta_theme2;
    private ImageButton ib_ta_theme3;
    private static String THEME_CODE = "THEME_CODE";
    
    //LOG_ID
    private String LOG_ID = "ThemeAct";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theme);
        
        ib_ta_theme1 = findViewById(R.id.ib_ta_theme1);
        ib_ta_theme2 = findViewById(R.id.ib_ta_theme2);
        ib_ta_theme3 = findViewById(R.id.ib_ta_theme3);
        
        ib_ta_theme1.setOnClickListener(ibThemeOneClicked);
        ib_ta_theme2.setOnClickListener(ibThemeTwoClicked);
        ib_ta_theme3.setOnClickListener(ibThemeThreeClicked);
    }
    
    private View.OnClickListener ibThemeOneClicked = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String theme = "themeOne";
            NewBoardSingleton.getInstance().setThemeChoice(theme);
            finish();
        }
    };
    
    private View.OnClickListener ibThemeTwoClicked = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String theme = "themeTwo";
            NewBoardSingleton.getInstance().setThemeChoice(theme);
            finish();
        }
    };
    
    private View.OnClickListener ibThemeThreeClicked = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String theme = "themeThree";
            NewBoardSingleton.getInstance().setThemeChoice(theme);
            finish();
        }
    };
}
