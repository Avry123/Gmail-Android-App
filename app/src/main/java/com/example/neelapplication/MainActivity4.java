package com.example.neelapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity4 extends AppCompatActivity {

    EditText phoneNo;
    Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        phoneNo = findViewById(R.id.phoneNo);
        send = findViewById(R.id.send);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity4.this, MainActivity5.class);
                intent1.putExtra("no", phoneNo.getText().toString());
                startActivity(intent1);
            }
        });
    }
}