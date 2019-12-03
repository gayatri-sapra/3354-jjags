package com.example.petnannydev.ui.calender;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.petnannydev.R;

public class CalenderFragment extends Fragment{

    private CalenderViewModel calenderViewModel;
    private Button eventButton;
    View root;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        calenderViewModel =
                ViewModelProviders.of(this).get(CalenderViewModel.class);
        root = inflater.inflate(R.layout.fragment_calender, container, false);
        eventButton = (Button) root.findViewById(R.id.eventButton);
        eventButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openToDoList();
            }
        });
        return root;
    }

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_calender);
        calenderViewModel = (CalenderViewModel) findViewById(R.id.calenderViewModel);

        calenderViewModel.setOnDateChangerListener(new CalenderViewModel.OnDateChangeListener(){
            @Override
            public void 

        });


    }

    public void openToDoList(){
        Intent intent = new Intent(getActivity(), ToDoList.class);
        startActivity(intent);
    }
}