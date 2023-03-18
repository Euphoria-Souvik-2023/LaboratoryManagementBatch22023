package com.example.laboratorymanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText nameText,mailText,addressText,deliveryDateText,phoneNumberText,ageText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    private  void init(){
        nameText= (EditText) findViewById(R.id.name);
        mailText= (EditText) findViewById(R.id.mail);
        addressText= (EditText) findViewById(R.id.address);
        deliveryDateText= (EditText) findViewById(R.id.dlvrydt);
        phoneNumberText= (EditText) findViewById(R.id.phn);
        ageText= (EditText) findViewById(R.id.age);
    }
}