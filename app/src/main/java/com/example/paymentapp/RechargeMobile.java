package com.example.paymentapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.paymentapp.RV.PaymentRecent;

import java.util.ArrayList;

public class RechargeMobile extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    EditText etAmountMobile, etMobileNumber;
    Button btnRecharge;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recharge_mobile);

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


    etAmountMobile = findViewById(R.id.etAmountMobile);
    etMobileNumber = findViewById(R.id.etAmountMobile);
    btnRecharge = findViewById(R.id.btnRecharge);

    btnRecharge.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (etMobileNumber.getText().toString().isEmpty() || etAmountMobile.getText().toString().isEmpty() )
            {
                Toast.makeText(RechargeMobile.this, "Enter Required Details", Toast.LENGTH_SHORT).show();
            }
            else if (etMobileNumber.getText().toString().isEmpty())
            {
                Toast.makeText(RechargeMobile.this, "Enter Mobile Number", Toast.LENGTH_SHORT).show();
            }

            else {
                String amount = etAmountMobile.getText().toString().trim();
                String mobileNumber = etMobileNumber.getText().toString().trim();
                Intent intent = new Intent(RechargeMobile.this, Recharge.class);
                intent.putExtra("Amount777", amount);
                intent.putExtra("mobile777", mobileNumber);
                startActivity(intent);
            }
        }
    });



    }
}
