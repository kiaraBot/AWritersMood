package com.example.awritersmood.ui.newboard;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NewBoardViewModel extends ViewModel {
    
    private MutableLiveData<String> mText;
    
    public NewBoardViewModel(){
        mText = new MutableLiveData<>();
        mText.setValue("This is new board fragment");
    }
    
    public LiveData<String> getText(){return mText;}
}
