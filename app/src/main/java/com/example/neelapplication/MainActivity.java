package com.example.neelapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
   EditText message1;
   EditText message2;
   Button submit, gmail, dial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        message1 = findViewById(R.id.message1);
        message2 = findViewById(R.id.message2);
        submit = findViewById(R.id.submit);
        gmail = findViewById(R.id.gmail);
        dial = findViewById(R.id.dial);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             Intent intent1 = new Intent(MainActivity.this, MainActivity2.class);
             intent1.putExtra("message1", message1.getText().toString());
             intent1.putExtra("message2", message2.getText().toString());
             startActivity(intent1);
            }
        });

        gmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainActivity.this, MainActivity3.class);
                startActivity(intent2);
            }
        });

        dial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(MainActivity.this, MainActivity4.class);
                startActivity(intent3);
            }
        });
    }
}