package com.example.a011_intent_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void nextone(View view) {
        Intent i = new Intent(MainActivity.this,Wisher.class);
        startActivity(i);
    }

    public void browseme(View view) {
        Intent boo = new Intent(Intent.ACTION_WEB_SEARCH);
        boo.putExtra(SearchManager.QUERY,"Urmil Rupareliya");
        startActivity(boo);
    }

    public void contactme(View view) {
        Intent contact = new Intent();
        contact.setAction(Intent.ACTION_VIEW);
        contact.setData(ContactsContract.Contacts.CONTENT_URI);
        startActivity(contact);
    }

    public void callsomeone(View view) {
        Intent call = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:6354634577"));
        startActivity(call);
    }
}