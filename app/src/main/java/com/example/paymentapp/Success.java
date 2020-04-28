package com.example.paymentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Success extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);
        textView = findViewById(R.id.tvOutput);
        String amount = getIntent().getStringExtra("amount");
        textView.setText("Amount : " +amount);
    }
}
