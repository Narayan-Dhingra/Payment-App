package com.example.paymentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class RechargeMobile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recharge_mobile);

        //spinner
        Spinner spinner = (Spinner) findViewById(R.id.spinnerM);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(RechargeMobile.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.mobile_operator));
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_list_item_1);
        spinner.setAdapter(arrayAdapter);
    }
}
