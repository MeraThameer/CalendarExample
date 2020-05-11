package com.example.calendarviewexample;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CalendarView simpleCalendarView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simpleCalendarView=(CalendarView)findViewById(R.id.simpleCalendarView);

        // set the red color for the dates of  focused month
        simpleCalendarView.setFocusedMonthDateColor(Color.RED);
        // set the yellow color for the dates of an unfocused month
        simpleCalendarView.setUnfocusedMonthDateColor(Color.BLUE);
        // red color for the selected week's background
        simpleCalendarView.setSelectedWeekBackgroundColor(Color.RED);
        // green color for the week separator line
        simpleCalendarView.setWeekSeparatorLineColor(Color.GREEN);
        // perform setOnDateChangeListener event on CalendarView
        simpleCalendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month, int dayOfMonth) {
                // display the selected date by using a toast
                Toast.makeText(getApplicationContext(), dayOfMonth + "/" + month + "/" + year, Toast.LENGTH_LONG).show();
            }
        });
    }
}
