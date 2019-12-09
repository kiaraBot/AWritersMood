package com.example.awritersmood.ui.newboard;

import androidx.lifecycle.ViewModelProviders;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
        


        return root;
    }

}
