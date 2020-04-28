package com.example.paymentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Recharge extends AppCompatActivity {

    TextView textView, textView1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recharge);

        textView = findViewById(R.id.tvmobile999);
//        textView1 = findViewById(R.id.tvamount999);
//        String amount = getIntent().getStringExtra("amount777");
        String mobileno = getIntent().getStringExtra("mobile777");
        textView.setText("Amount : " +mobileno);
//        textView1.setText("Amount : " +amount);
    }
}
