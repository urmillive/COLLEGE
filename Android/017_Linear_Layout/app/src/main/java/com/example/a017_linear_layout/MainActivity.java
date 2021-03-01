package com.example.a017_linear_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void toggle(View view) {
        LinearLayout ll = (LinearLayout) findViewById(R.id.ll);
        if(ll.getOrientation() == LinearLayout.VERTICAL){
            ll.setOrientation(LinearLayout.HORIZONTAL);
        }else{
            ll.setOrientation(LinearLayout.VERTICAL);
        }
    }
}