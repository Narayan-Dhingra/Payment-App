package com.example.paymentapp;

import android.annotation.SuppressLint;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class AddMoney extends AppCompatActivity {

    EditText editText;
    Button button;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_add_money);

        editText = findViewById(R.id.etAmount);
        button = findViewById(R.id.btnAddMoney);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText().toString().isEmpty()) {
                    Toast.makeText(AddMoney.this, "Enter Amount", Toast.LENGTH_SHORT).show();
                }
                else {
                    String amount = editText.getText().toString().trim();
                    Intent intent = new Intent(AddMoney.this, Success.class);
                    intent.putExtra("amount", amount);
                    startActivity(intent);
                }
            }
        });


    }
}
