package com.example.petnannydev.ui.calender;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.petnannydev.R;

public class ToDoList extends AppCompatActivity {

    Button saveButton;
    Button discardButton;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_do_list);

        saveButton = (Button) findViewById(R.id.saveEvent);
        discardButton = (Button) findViewById(R.id.discardEvent);
        saveButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

            }
        });
        discardButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
               
            }
        });
    }
}
