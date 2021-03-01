package com.example.a019_list_view_java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> lst = new ArrayList<String>();
        lst.add("amreli hanumanpara");
        lst.add("jafarabad");
        lst.add("khambha");
        lst.add("juna vaghaniya");
        lst.add("malvan");

        ArrayAdapter<String> aa = new ArrayAdapter<String>(this,R.layout.mytextview,lst);

        ListView lv = (ListView) findViewById(R.id.lv);
        lv.setAdapter(aa);


    }
}