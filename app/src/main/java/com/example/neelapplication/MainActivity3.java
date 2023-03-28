package com.example.neelapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    EditText to, subject, message;
    Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        to = findViewById(R.id.to);
        subject = findViewById(R.id.subject);
        message = findViewById(R.id.message);
        send = findViewById(R.id.send);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gmail = new Intent(Intent.ACTION_SEND);
                gmail.setType("text/html");
                Toast.makeText(MainActivity3.this, to.getText().toString(), Toast.LENGTH_LONG).show();
                gmail.putExtra(Intent.EXTRA_EMAIL, new String[]{to.getText().toString()});
                gmail.putExtra(Intent.EXTRA_SUBJECT,subject.getText().toString());
                gmail.putExtra(Intent.EXTRA_TEXT, message.getText().toString());
                startActivity(gmail);
            }
        });
    }
}