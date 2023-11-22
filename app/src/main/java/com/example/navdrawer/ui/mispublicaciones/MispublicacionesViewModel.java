package com.example.navdrawer.ui.mispublicaciones;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MispublicacionesViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public MispublicacionesViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}