package com.skite.catchat.ui.draftz;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DraftzViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public DraftzViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Draftz");
    }

    public LiveData<String> getText() {
        return mText;
    }
}