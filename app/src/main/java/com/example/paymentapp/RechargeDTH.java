package com.example.paymentapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.paymentapp.RV.PaymentRecent;

import java.util.ArrayList;

public class RechargeDTH extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recharge_dth);


        ArrayList<PaymentRecent> rpaymentList = new ArrayList<>();
        rpaymentList.add(new PaymentRecent(R.drawable.airtel, "Electricity Bill",
                "88161184648", "Date:  10 jan 2019", "Success", "₹ 2584"));
        rpaymentList.add(new PaymentRecent(R.drawable.jio, "Electricity Bill",
                "88161184648", "Date:  21 feb 2019", "Success", "₹ 200"));
        rpaymentList.add(new PaymentRecent(R.drawable.sun_direct, "Electricity Bill",
                "88161184648", "Date:  20 aug 2018", "Success", "₹ 4021"));
        rpaymentList.add(new PaymentRecent(R.drawable.airtel, "Electricity Bill",
                "88161184648", "Date:  10 jan 2019", "Success", "₹ 2584"));
        rpaymentList.add(new PaymentRecent(R.drawable.jio, "Electricity Bill",
                "88161184648", "Date:  21 feb 2019", "Success", "₹ 200"));
        rpaymentList.add(new PaymentRecent(R.drawable.sun_direct, "Electricity Bill",
                "88161184648", "Date:  20 aug 2018", "Success", "₹ 4021"));
        rpaymentList.add(new PaymentRecent(R.drawable.airtel, "Electricity Bill",
                "88161184648", "Date:  10 jan 2019", "Success", "₹ 2584"));
        rpaymentList.add(new PaymentRecent(R.drawable.jio, "Electricity Bill",
                "88161184648", "Date:  21 feb 2019", "Success", "₹ 200"));
        rpaymentList.add(new PaymentRecent(R.drawable.sun_direct, "Electricity Bill",
                "88161184648", "Date:  20 aug 2018", "Success", "₹ 4021"));

        recyclerView = findViewById(R.id.recyclerViewxxx);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        adapter = new RPaymentAdapter(rpaymentList);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

        //spinner
        Spinner spinner = (Spinner) findViewById(R.id.spinnerD);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(RechargeDTH.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.dth_operator));
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_list_item_1);
        spinner.setAdapter(arrayAdapter);


    }

}
