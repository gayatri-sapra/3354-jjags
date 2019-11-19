package com.example.petnannydev.ui.medical_history;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.petnannydev.R;

public class MedicalHistoryFragment extends Fragment {

    private MedicalHistoryViewModel medicalHistoryViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        medicalHistoryViewModel =
                ViewModelProviders.of(this).get(MedicalHistoryViewModel.class);
        View root = inflater.inflate(R.layout.fragment_medical_history, container, false);

        medicalHistoryViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {

            }
        });

        return root;
    }



}