package com.example.test;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.CalendarView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CalendarActivity extends AppCompatActivity {
    private static final String TAG = "CalendarActivity";

    private CalendarView mCalendarView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);
        mCalendarView = (CalendarView) findViewById(R.id.calendarView);

        mCalendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener(){
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int i, int i1, int i2) {

                String date = i + "/" + i1 + "/" + i2;
                Log.d(TAG,"onSelectedDayChange: mm/dd/yyyy: " + date);

                Intent intent = new Intent(CalendarActivity.this, DateActivity.class);
                intent.putExtra("date", date);
                startActivity(intent);
            }

        });
    }
}
