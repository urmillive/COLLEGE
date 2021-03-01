package com.example.a005_calculator1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText e1;
    EditText e2;
    EditText e3;
    EditText e4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = (EditText) findViewById(R.id.ed1);
        e2 = (EditText) findViewById(R.id.ed2);
        e3 = (EditText) findViewById(R.id.ed3);
        e4 = (EditText) findViewById(R.id.ed4);
    }

    public void btnclear(View view) {
        e1.setText("");
        e2.setText("");
        e3.setText("");
        e4.setText("");
    }

    public void btnres(View view) {
        int a;
        int b;
        try {
            a = Integer.parseInt(e1.getText().toString());
        } catch (Exception e) {
            a = 0;
        }
        try {
            b = Integer.parseInt(e2.getText().toString());
        } catch (Exception e) {
            b = 0;
        }
        String c = e3.getText().toString();
        Integer result = 0;
        if (c.equals("+")) {
            result = a + b;
        } else if (c.equals("-")) {
            result = a - b;
        } else if (c.equals("*")) {
            result = a * b;
        } else if (c.equals("/") && b != 0) {
            result = a / b;
        } else {
            e4.setText("Invalid");
        }
        e4.setText(result.toString());
    }
}