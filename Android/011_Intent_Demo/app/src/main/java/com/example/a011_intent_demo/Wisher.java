package com.example.a011_intent_demo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

public class Wisher extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisher);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
                Intent email = new Intent(Intent.ACTION_SEND, Uri.parse("mailto:"));
                email.putExtra(Intent.EXTRA_EMAIL, "urmilrupareliya14@gmail.com");
                email.putExtra(Intent.EXTRA_TEXT, "This is Body of email");
                startActivity(Intent.createChooser(email, "Choose an email client from.."));
//                startActivity(email);


            }
        });
    }

    public void goback(View view) {
        Intent gb = new Intent(Wisher.this, MainActivity.class);
        startActivity(gb);
    }
}