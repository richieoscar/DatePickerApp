package com.example.datepickerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

        TextView setDate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setDate = findViewById(R.id.textView_date);
    }

    public void showDatePicker(View view) {
        DatePickerFragment newFragment = new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(), getString(R.string.date_picker));

    }


    public void processDatePickerResult(int year, int month, int day){
        String day_string = String.valueOf(day);
        String year_string = String.valueOf(year);
        String month_string = String.valueOf(month +1);

        String dateMessage = (month_string +"/" +day_string +"/" +year_string);

        setDate.setText(dateMessage);
        //Toast.makeText(this, getString(R.string.date) +dateMessage, Toast.LENGTH_SHORT).show();
    }

    public void showTimePicker(View view) {
        TimePickerFragment newFragment = new TimePickerFragment();
        newFragment.show(getSupportFragmentManager(), getString(R.string.time));
    }

    public  void processTimePickerResult(int hours, int minutes){
        String hour = Integer.toString(hours);
        String minute = Integer.toString(minutes);

        String timeMessage = (hour +":" +minutes);
        setDate.setText(timeMessage);
       // Toast.makeText(this, "Time " +timeMessage, Toast.LENGTH_SHORT).show();

    }
}