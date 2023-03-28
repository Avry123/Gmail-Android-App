package com.example.neelapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    EditText message10, message20;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent1 = getIntent();
        Bundle stuff = intent1.getExtras();
        String message1 = stuff.getString("message1");
        String message2 = stuff.getString("message2");
        message10 =  findViewById(R.id.message1);
        message20 = findViewById(R.id.message2);
        message10.setText(message1);
        message20.setText(message2);
    }
}