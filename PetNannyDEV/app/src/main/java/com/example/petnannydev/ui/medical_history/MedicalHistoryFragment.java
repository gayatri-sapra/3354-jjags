package com.example.petnannydev.ui.medical_history;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.petnannydev.R;

public class MedicalHistoryFragment extends Fragment {

    private MedicalHistoryViewModel medicalHistoryViewModel;


    EditText petConditions;
    EditText vetName;
    EditText vetAddress;
    EditText vetPhone;
    EditText petGshots;
    EditText petPshots;
    EditText petFood;
    EditText petGroom;

    public static final String LAST_TEXT6 = "petConditions";
    public static final String LAST_TEXT7 = "vetName";
    public static final String LAST_TEXT8 = "vetAddress";
    public static final String LAST_TEXT9 = "vetPhone";
    public static final String LAST_TEXT10 = "petGshots";
    public static final String LAST_TEXT11 = "petPshots";
    public static final String LAST_TEXT12 = "petFood";
    public static final String LAST_TEXT13 = "petGroom";

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

        petConditions = (EditText) root.findViewById(R.id.petConditions);
        vetName = (EditText) root.findViewById(R.id.vetName);
        vetAddress = (EditText) root.findViewById(R.id.vetAddress);
        vetPhone = (EditText) root.findViewById(R.id.vetPhoneNumber);
        petGshots = (EditText) root.findViewById(R.id.givenShots);
        petPshots = (EditText) root.findViewById(R.id.pendingShots);
        petFood = (EditText) root.findViewById(R.id.foodConsumptions);
        petGroom = (EditText) root.findViewById(R.id.grooming);

        final SharedPreferences mPref = PreferenceManager.getDefaultSharedPreferences(getActivity());

        petConditions.setText(mPref.getString(LAST_TEXT6, ""));
        vetName.setText(mPref.getString(LAST_TEXT7, ""));
        vetAddress.setText(mPref.getString(LAST_TEXT8, ""));
        vetPhone.setText(mPref.getString(LAST_TEXT9, ""));
        petGshots.setText(mPref.getString(LAST_TEXT10, ""));
        petPshots.setText(mPref.getString(LAST_TEXT11, ""));
        petFood.setText(mPref.getString(LAST_TEXT12, ""));
        petGroom.setText(mPref.getString(LAST_TEXT13, ""));


        petConditions.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mPref.edit().putString(LAST_TEXT6, s.toString()).commit();
            }
            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        vetName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mPref.edit().putString(LAST_TEXT7, s.toString()).commit();
            }
            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        vetAddress.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mPref.edit().putString(LAST_TEXT8, s.toString()).commit();
            }
            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        vetPhone.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mPref.edit().putString(LAST_TEXT9, s.toString()).commit();
            }
            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        petGshots.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mPref.edit().putString(LAST_TEXT10, s.toString()).commit();
            }
            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        petPshots.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mPref.edit().putString(LAST_TEXT11,s.toString()).commit();
            }
            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        petFood.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mPref.edit().putString(LAST_TEXT12,s.toString()).commit();
            }
            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        petGroom.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mPref.edit().putString(LAST_TEXT13,s.toString()).commit();
            }
            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        return root;
    }
}
