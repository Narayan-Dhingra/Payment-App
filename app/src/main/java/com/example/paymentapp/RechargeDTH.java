package com.example.paymentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class RechargeDTH extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recharge_dth);

        //spinner
        Spinner spinner = (Spinner) findViewById(R.id.spinnerD);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(RechargeDTH.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.dth_operator));
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_list_item_1);
        spinner.setAdapter(arrayAdapter);


    }

}
