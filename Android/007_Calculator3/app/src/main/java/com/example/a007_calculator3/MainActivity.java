package com.example.a007_calculator3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText e1;
    EditText e2;
    EditText e3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = (EditText) findViewById(R.id.ed1);
        e2 = (EditText) findViewById(R.id.ed2);
        e3 = (EditText) findViewById(R.id.ed3);

        Button plus = (Button) findViewById(R.id.btnplus);
        Button minus = (Button) findViewById(R.id.btnminus);
        Button mul = (Button) findViewById(R.id.btnmul);
        Button div = (Button) findViewById(R.id.btndiv);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setRes(getX() + getY());
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setRes(getX() - getY());
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setRes(getX() * getY());
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (getY() != 0) {
                    setRes(getX() / getY());
                }
                else{
                    setRes("Invalid Inputs");
                }
            }
        });
    }

    public void setRes(Object n) {
        e3.setText(n.toString());
    }

    public Integer getX() {
        try {
            return Integer.parseInt(e1.getText().toString());
        } catch (Exception e) {
            return 0;
        }
    }

    public Integer getY() {
        try {
            return Integer.parseInt(e2.getText().toString());
        } catch (Exception e) {
            return 0;
        }
    }


    public void btnclear(View view) {
        e1.setText("");
        e2.setText("");
        e3.setText("");
    }
}