package com.example.datepickerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
        Toast.makeText(this, getString(R.string.date) +dateMessage, Toast.LENGTH_SHORT).show();
    }
}