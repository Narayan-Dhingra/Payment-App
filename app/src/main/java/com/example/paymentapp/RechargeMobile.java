package com.example.paymentapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.paymentapp.RV.PaymentRecent;

import java.util.ArrayList;

public class RechargeMobile extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recharge_mobile);

        ArrayList<PaymentRecent> rpaymentList = new ArrayList<>();
        rpaymentList.add(new PaymentRecent(R.drawable.airtel, "Electricity Bill",
                "88161184648", "Due Date:  21 may 2019", "2254", "Success"));
        rpaymentList.add(new PaymentRecent(R.drawable.airtel, "Electricity Bill",
                "88161184648", "Due Date:  21 may 2019", "2254", "Success"));
        rpaymentList.add(new PaymentRecent(R.drawable.airtel, "Electricity Bill",
                "88161184648", "Due Date:  21 may 2019", "2254", "Success"));
        rpaymentList.add(new PaymentRecent(R.drawable.airtel, "Electricity Bill",
                "88161184648", "Due Date:  21 may 2019", "2254", "Success"));
        rpaymentList.add(new PaymentRecent(R.drawable.airtel, "Electricity Bill",
                "88161184648", "Due Date:  21 may 2019", "2254", "Success"));

        recyclerView = findViewById(R.id.recyclerView2);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        adapter = new RPaymentAdapter(rpaymentList);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

        //spinner
        Spinner spinner = (Spinner) findViewById(R.id.spinnerM);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(RechargeMobile.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.mobile_operator));
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_list_item_1);
        spinner.setAdapter(arrayAdapter);
    }
}
