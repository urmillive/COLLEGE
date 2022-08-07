package com.example.a003authenticationvalidationtoast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Patterns;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String email = "admin@gmail.com";
    private String password = "admin";

    private Button btn_login;
    private EditText txt_email, txt_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_login = (Button) findViewById(R.id.btn_login);
        txt_email = (EditText) findViewById(R.id.txt_email);
        txt_password = (EditText) findViewById(R.id.txt_password);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txt_email.getText().toString().equals(email) && txt_password.getText().toString().equals(password))
                {
                    Intent i = new Intent(MainActivity.this, MainActivity2.class);
                    startActivity(i);
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Invalid Email & Password", Toast.LENGTH_SHORT).show();
                }
            }
        });
        txt_email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                validate();
            }
        });
        txt_password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                validate();
            }
        });
    }
    private void validate()
    {
        if(Patterns.EMAIL_ADDRESS.matcher(txt_email.getText().toString()).matches() && txt_password.getText().length() >=4)
        {
            btn_login.setEnabled(true);
        }else{
            btn_login.setEnabled(false);
        }
    }
}