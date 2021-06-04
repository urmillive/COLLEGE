package com.example.agecalculator;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private Integer d1, m1, y1, d2, m2, y2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Calendar c1 = Calendar.getInstance();

        d1 = c1.get(Calendar.DAY_OF_MONTH);
        m1 = c1.get(Calendar.MONTH);
        y1 = c1.get(Calendar.YEAR);
        d2 = c1.get(Calendar.DAY_OF_MONTH);
        m2 = c1.get(Calendar.MONTH);
        y2 = c1.get(Calendar.YEAR);

        ((EditText) findViewById(R.id.d1)).setText(String.format("%2d", d1).replace(" ", "0") + "/" + String.format("%2d", m1 + 1).replace(" ", "0") + "/" + y1);
        ((EditText) findViewById(R.id.d2)).setText(String.format("%2d", d1).replace(" ", "0") + "/" + String.format("%2d", m1 + 1).replace(" ", "0") + "/" + y1);

        Button sl1 = (Button) findViewById(R.id.sl1);
        sl1.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onClick(View v) {
                DatePickerDialog dpd1 = new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        ((EditText) findViewById(R.id.d1)).setText(String.format("%2d", dayOfMonth).replace(" ", "0") + "/" + String.format("%2d", month + 1).replace(" ", "0") + "/" + year);
                        y1 = year;
                        m1 = month;
                        d1 = dayOfMonth;
                    }
                }, y1, m1, d1);
                dpd1.show();
            }
        });

        Button sl2 = (Button) findViewById(R.id.sl2);
        sl2.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onClick(View v) {
                DatePickerDialog dpd2 = new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        ((EditText) findViewById(R.id.d2)).setText(String.format("%2d", dayOfMonth).replace(" ", "0") + "/" + String.format("%2d", month + 1).replace(" ", "0") + "/" + year);
                        y2 = year;
                        m2 = month;
                        d2 = dayOfMonth;
                    }
                }, y2, m2, d2);
                dpd2.show();
            }
        });
    }

    public String getDate(int d, int m, int y) {
        return String.format("%2d", d).replace(" ", "0") + "/" + String.format("%2d", m + 1).replace(" ", "0") + "/" + String.format("%4d", y);
    }

    public void makediff(View view) {
        String dateStart = getDate(d1, m1, y1);
        String dateStop = getDate(d2, m2, y2);

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        Date d1 = null;
        Date d2 = null;
        try {
            d1 = format.parse(dateStart);
            d2 = format.parse(dateStop);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // Get msec from each, and subtract.
        long diff = d2.getTime() - d1.getTime();
        long diffDays = diff / (60 * 60 * 1000 * 24);
        diffDays += 1;
        if (diffDays > 0) {
            long o_diffdays = diffDays;
            long years = (diffDays / 1461) * 4;
            diffDays %= 1461;
            years += diffDays / 365;
            diffDays %= 365;

            long[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            if(y2%4 == 0){
                days[1] = 29;
            }
            long tot = 0;
            int i = 0;
            int j = m1;
            for (i = 0; i < 12; i++) {
                if (tot + days[j % 12] > diffDays) {
                    break;
                }
                tot += days[j % 12];
                j++;
            }
            diffDays -= tot;
            Toast.makeText(getApplicationContext(), "Years : " + years + "\nMonths : " + i + "\nDays : " + diffDays, Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getApplicationContext(), "Invalid Date", Toast.LENGTH_SHORT).show();
        }
    }
}