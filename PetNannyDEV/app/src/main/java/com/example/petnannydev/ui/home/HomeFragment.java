package com.example.petnannydev.ui.home;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Picture;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.provider.MediaStore;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Base64;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.petnannydev.R;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ResourceBundle;

import static android.app.Activity.RESULT_OK;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    ImageView profilePic;
    Button button;
    private static final int PICK_IMAGE = 100;
    Uri imageUri;
    EditText petName;
    EditText petOwner;
    EditText petAge;
    EditText petBreed;
    EditText petBirth;

    public static Uri imageUriPerm = null;
    public static final String LAST_TEXT1 = "petName";
    public static final String LAST_TEXT2 = "petOwner";
    public static final String LAST_TEXT3 = "petAge";
    public static final String LAST_TEXT4 = "petBreed";
    public static final String LAST_TEXT5 = "petBirth";


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        profilePic = (ImageView) root.findViewById(R.id.profilePic);
        button = (Button) root.findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
            openGallery();
        }
        });

        petName = (EditText) root.findViewById(R.id.nameInput);
        petOwner = (EditText) root.findViewById(R.id.ownerInput);
        petAge = (EditText) root.findViewById(R.id.ageInput);
        petBreed = (EditText) root.findViewById(R.id.breedInput);
        petBirth = (EditText) root.findViewById(R.id.birthdayInput);
        if(imageUriPerm != null)
        {
            profilePic.setImageURI(imageUriPerm);
        }
        
        final SharedPreferences hPref = PreferenceManager.getDefaultSharedPreferences(getActivity());
        petName.setText(hPref.getString(LAST_TEXT1, ""));
        petOwner.setText(hPref.getString(LAST_TEXT2, ""));
        petAge.setText(hPref.getString(LAST_TEXT3, ""));
        petBreed.setText(hPref.getString(LAST_TEXT4, ""));
        petBirth.setText(hPref.getString(LAST_TEXT5, ""));

        SharedPreferences myPrefrence = PreferenceManager.getDefaultSharedPreferences(getActivity());
        String imageS = myPrefrence.getString("imagePreferance", "");
        Log.d("Image Log:", imageS);
        Bitmap imageB;
        if(!imageS.equals(""))
        {
            imageB = decodeToBase64(imageS);
            profilePic.setImageURI(imageUriPerm);


        }

        System.out.println("I have been EX");

        petName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                hPref.edit().putString(LAST_TEXT1, s.toString()).commit();
            }
            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        petOwner.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                hPref.edit().putString(LAST_TEXT2, s.toString()).commit();
            }
            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        petAge.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                hPref.edit().putString(LAST_TEXT3, s.toString()).commit();
            }
            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        petBreed.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                hPref.edit().putString(LAST_TEXT4, s.toString()).commit();
            }
            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        petBirth.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                hPref.edit().putString(LAST_TEXT5, s.toString()).commit();
            }
            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        return root;
    }



    public void onStop(Intent data)
    {
        imageUriPerm = data.getData();
    }

    public void openGallery(){
        Intent gallery = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI);
        startActivityForResult(gallery, PICK_IMAGE);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode,resultCode,data);
        if(resultCode == RESULT_OK && requestCode == PICK_IMAGE) {

            if(data.getData() != null) {
                imageUri = data.getData();
                imageUriPerm = imageUri;
                profilePic.setImageURI(imageUriPerm);

                petName.setText(petName.getEditableText(), TextView.BufferType.SPANNABLE);
            }

        }

//        try {
//            Bitmap bitmap = MediaStore.Images.Media.getBitmap(getActivity().getContentResolver(), imageUri);
//            SharedPreferences myPrefrence = PreferenceManager.getDefaultSharedPreferences(getActivity());
//            SharedPreferences.Editor editor = myPrefrence.edit();
//            editor.putString("imagePreferance", encodeToBase64(bitmap));
//            editor.commit();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }



    }
    public static Bitmap decodeToBase64(String input) {
        byte[] decodedByte = Base64.decode(input, 0);
        return BitmapFactory.decodeByteArray(decodedByte, 0, decodedByte.length);
    }

    public static String encodeToBase64(Bitmap image) {
        Bitmap immage = image;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        immage.compress(Bitmap.CompressFormat.PNG, 100, baos);
        byte[] b = baos.toByteArray();
        String imageEncoded = Base64.encodeToString(b, Base64.DEFAULT);

        Log.d("Image Log:", imageEncoded);
        return imageEncoded;
    }



}