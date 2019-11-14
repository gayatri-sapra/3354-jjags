package com.example.petnannydev.ui.medical_history;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MedicalHistoryViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public MedicalHistoryViewModel() {
        mText = new MutableLiveData<>();
    }

    public LiveData<String> getText() {
        return mText;
    }
}