package com.example.a006_calculator2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText e1 = (EditText) findViewById(R.id.ed1);
        final EditText e2 = (EditText) findViewById(R.id.ed2);
        final EditText e3 = (EditText) findViewById(R.id.ed3);
        final EditText e4 = (EditText) findViewById(R.id.ed4);
        final int result = 0;
        e3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
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
                Boolean flag = true;
                int result = 0;

                if (c.equals("+")) {
                    result = a + b;
                } else if (c.equals("-")) {
                    result = a - b;
                } else if (c.equals("*")) {
                    result = a * b;
                } else if (c.equals("/") && b != 0) {

                } else {
                    flag = false;
                }
                if (flag) {
                    e4.setText(((Integer) result).toString());
                } else {
                    e4.setText("Invalid");
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }

    public void btnclear(View v) {
        EditText e1 = (EditText) findViewById(R.id.ed1);
        EditText e2 = (EditText) findViewById(R.id.ed2);
        EditText e3 = (EditText) findViewById(R.id.ed3);
        EditText e4 = (EditText) findViewById(R.id.ed4);

        e1.setText("");
        e2.setText("");
        e3.setText("");
        e4.setText("");

    }

}