package com.example.awritersmood.ui.newboard;

import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProviders;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;

import com.example.awritersmood.R;
import com.example.awritersmood.ui.newboard.boardlayout.BoardLayoutActivity;
import com.example.awritersmood.ui.newboard.boardtheme.ThemeActivity;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import static android.app.Activity.RESULT_OK;
import static com.example.awritersmood.R.layout.ic_board_layout_one;
import static com.example.awritersmood.R.layout.ic_board_layout_three;
import static com.example.awritersmood.R.layout.ic_board_layout_two;


public class NewBoardFragment extends Fragment {
    private FloatingActionButton fab_LayoutAct;
    private FloatingActionButton fab_ThemeAct;
    private FloatingActionButton fab_TextAct;
    private FloatingActionButton fab_AppImagesAct;
    private FloatingActionButton fab_CameraAct;
    private FloatingActionButton fab_UnsplashAct;
    
    private View ic_bl_include;
    View root;
    ViewStub vs_board_layout;
    
    private NewBoardViewModel newBoardViewModel;
    
    private static int LAYOUT_ACT_REQUEST = 1;
    private static int THEME_ACT_REQUEST = 2;
    private static int TEXT_ACT_REQUEST = 3;
    private static int APP_IMAGES_ACT_REQUEST = 4;
    private static int CAMERA_ACT_REQUEST = 5;
    private static int UNSPLASH_ACT_REQUEST = 6;
    
    private static String LAYOUT_CODE = "LAYOUT_CODE";
    private static String THEME_CODE = "THEME_CODE";
    private static String TEXT_CODE = "TEXT_CODE";
    private static String APP_IMAGE_CODE = "APP_IMAGE_CODE";
    private static String CAMERA_CODE = "CAMERA_CODE";
    private static String UNSPLASH_CODE = "UNSPLASH_CODE";
    
    private String layoutChoice;
    
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        newBoardViewModel = ViewModelProviders.of(this).get(NewBoardViewModel.class);
        root = inflater.inflate(R.layout.fragment_newboard, container, false);
        
        //TODO: Include & ViewStub
        ic_bl_include = root.findViewById(R.id.ic_bl_include);
        
        fab_LayoutAct = root.findViewById(R.id.fab_LayoutAct);
        fab_ThemeAct = root.findViewById(R.id.fab_ThemeAct);
        fab_TextAct = root.findViewById(R.id.fab_TextAct);
        fab_AppImagesAct = root.findViewById(R.id.fab_AppImagesAct);
        fab_CameraAct = root.findViewById(R.id.fab_CameraAct);
        fab_UnsplashAct = root.findViewById(R.id.fab_UnsplashAct);
    
        fab_LayoutAct.setOnClickListener(fab_LayoutActListener);
        fab_ThemeAct.setOnClickListener(fab_ThemeActListener);
        fab_TextAct.setOnClickListener(fab_TextActListener);
        fab_AppImagesAct.setOnClickListener(fab_AppImagesActListener);
        fab_CameraAct.setOnClickListener(fab_CameraActListener);
        fab_UnsplashAct.setOnClickListener(fab_UnsplashActListener);

        return root;
    }
    
    private View.OnClickListener fab_LayoutActListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent boardLayoutActIntent = new Intent(getActivity(), BoardLayoutActivity.class);
            startActivityForResult(boardLayoutActIntent, LAYOUT_ACT_REQUEST);
            
            //TODO: Include & ViewStub
        }
    };
    
    private View.OnClickListener fab_ThemeActListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent themeActIntent = new Intent(getActivity(), ThemeActivity.class);
            startActivityForResult(themeActIntent, THEME_ACT_REQUEST);
            
        }
    };
    
    private View.OnClickListener fab_TextActListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
        
        }
    };
    
    private View.OnClickListener fab_AppImagesActListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
        
        }
    };
    
    private View.OnClickListener fab_CameraActListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
        
        }
    };
    
    private View.OnClickListener fab_UnsplashActListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
        
        }
    };
    
    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        //TODO: Include & ViewStub
        //  If user clicks a layout for the second time, the app does not shut down. The user can pick each layout once, but they cannot got back to a previous layout.
        if(requestCode == LAYOUT_ACT_REQUEST && resultCode == RESULT_OK){
            layoutChoice = data.getStringExtra(LAYOUT_CODE);
            switch (layoutChoice){
                case "layoutOne":
                    vs_board_layout = root.findViewById(R.id.vs_bl_one);

                    vs_board_layout.setLayoutResource(ic_board_layout_one);
                    vs_board_layout.inflate();
                    break;
                case "layoutTwo":
                    vs_board_layout = root.findViewById(R.id.vs_bl_two);
                    vs_board_layout.setLayoutResource(ic_board_layout_two);
                    vs_board_layout.inflate();
                    break;
                case "layoutThree":
                    vs_board_layout = root.findViewById(R.id.vs_bl_three);
                    vs_board_layout.setLayoutResource(ic_board_layout_three);
                    vs_board_layout.inflate();
                default:
                    break;
            }
            
        }
    }
}





















