package com.example.awritersmood.ui.newboard;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.awritersmood.R;

public class NewBoardFragment extends Fragment {
    
    private NewBoardViewModel newBoardViewModel;
    
/*    public static NewBoardFragment newInstance() {
        return new NewBoardFragment();
    }*/
    
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        newBoardViewModel = ViewModelProviders.of(this).get(NewBoardViewModel.class);
        View root = inflater.inflate(R.layout.fragment_newboard, container, false);
        
/*        final TextView textView = root.findViewById(R.id.text_newboard);
        newBoardViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                textView.setText(s);
            }
        });*/
        return root;
    }
}
