package com.example.a010_datepickerdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DatePicker dp = (DatePicker) findViewById(R.id.dp1);

        String x = "Day:" + dp.getDayOfMonth();
        String y = "Month:"+ dp.getMonth();
        String z = "Year:" + dp.getYear();
        Toast.makeText(getApplicationContext(),x+"\n"+y+"\n"+z, Toast.LENGTH_LONG).show();
        
    }
}