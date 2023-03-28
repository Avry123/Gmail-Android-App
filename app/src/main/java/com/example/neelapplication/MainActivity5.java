package com.example.neelapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity5 extends AppCompatActivity {
    EditText phoneNo1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        Intent intent = getIntent();
        Bundle getIt = intent.getExtras();
        String phoneNo = getIt.getString("no");
        phoneNo1 = findViewById(R.id.showNo);
        phoneNo1.setText(phoneNo);

    }
}