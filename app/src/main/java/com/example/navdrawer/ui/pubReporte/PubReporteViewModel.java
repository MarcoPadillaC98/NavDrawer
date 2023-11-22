package com.example.navdrawer.ui.pubReporte;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PubReporteViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public PubReporteViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}