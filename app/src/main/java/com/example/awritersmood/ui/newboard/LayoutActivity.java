package com.example.awritersmood.ui.newboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageButton;

import com.example.awritersmood.R;

public class LayoutActivity extends AppCompatActivity {
    private ImageButton ib_bl_one;
    private ImageButton ib_bl_two;
    private ImageButton ib_bl_three;

    
    private String layoutString;
    private static String LAYOUT_CODE = "LAYOUT_CODE";
    
    //TODO: Include & ViewStub
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_board_layout);
        
        ib_bl_one = findViewById(R.id.ib_bl_one);
        ib_bl_two = findViewById(R.id.ib_bl_two);
        ib_bl_three = findViewById(R.id.ib_bl_three);
        
        ib_bl_one.setOnClickListener(ibLayoutOne);
        ib_bl_two.setOnClickListener(ibLayoutTwo);
        ib_bl_three.setOnClickListener(ibLayoutThree);
    }
    
    private View.OnClickListener ibLayoutOne = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            layoutString = "layoutOne";
            setResultAndIntent(layoutString);
        }
    };
    
    private View.OnClickListener ibLayoutTwo = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            layoutString = "layoutTwo";
            setResultAndIntent(layoutString);
        }
    };
    
    private View.OnClickListener ibLayoutThree = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            layoutString = "layoutThree";
            setResultAndIntent(layoutString);
        }
    };
    
    private void setResultAndIntent(String layoutString){
        Intent layoutIntent = new Intent();
        layoutIntent.putExtra(LAYOUT_CODE, layoutString);
        setResult(RESULT_OK, layoutIntent);
        finish();
    }
}
















