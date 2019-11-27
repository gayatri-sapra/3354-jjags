package com.example.petnannydev.ui.home;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.petnannydev.R;

import static android.app.Activity.RESULT_OK;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    ImageView profilePic;
    Button button;
    private static final int PICK_IMAGE = 100;
    Uri imageUri;
    EditText name;
    EditText owner;
    EditText age;
    EditText breed;

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

        name = (EditText) root.findViewById(R.id.nameInput);
        owner = (EditText) root.findViewById(R.id.ownerInput);
        age = (EditText) root.findViewById(R.id.ageInput);
        breed = (EditText) root.findViewById(R.id.breedInput);
        return root;
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
            imageUri = data.getData();
            profilePic.setImageURI(imageUri);
            name.setText(name.getEditableText(), TextView.BufferType.SPANNABLE);
        }


    }


}