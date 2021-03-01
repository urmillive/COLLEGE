package com.example.a012_intent_share_data;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        Bundle b = getIntent().getExtras();
        String x = b.getString("fnm");
        String y = b.getString("mnm");
        String z = b.getString("lnm");
        Toast.makeText(getApplicationContext(),x + " "+ y + " " + z,Toast.LENGTH_LONG).show();

    }
}