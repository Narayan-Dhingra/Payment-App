package com.example.paymentapp.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.paymentapp.MainActivity;
import com.example.paymentapp.PaymentAdapter;
import com.example.paymentapp.R;
import com.example.paymentapp.RV.PaymentUpcoming;

import java.util.ArrayList;


public class HomeFragment extends Fragment {

//    private RecyclerView recyclerView;
//    private RecyclerView.Adapter adapter;
//    private RecyclerView.LayoutManager layoutManager;
//
//    @Override
//    public void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//
//
//        ArrayList<PaymentUpcoming> paymentList = new ArrayList<>();
//        paymentList.add(new PaymentUpcoming(R.drawable.electricity_icon, "Electricity Bill",
//                "88161184648", "Due Date:  21 may 2019", "Pay Now"));
//        paymentList.add(new PaymentUpcoming(R.drawable.phone_icon, "Phone Bill",
//                "88165445648", "Due Date:  11 june 2019", "Pay Now"));
//        paymentList.add(new PaymentUpcoming(R.drawable.telephone_icon, "Telephone Bill",
//                "82222222648", "Due Date:  25 august 2019", "Pay Now"));
//        paymentList.add(new PaymentUpcoming(R.drawable.train_icon, "Transport Bill",
//                "88111111648", "Due Date:  10 january 2019", "Pay Now"));
//        paymentList.add(new PaymentUpcoming(R.drawable.electricity_icon, "Electricity Bill",
//                "88161184648", "Due Date:  21 may 2019", "Pay Now"));
//        paymentList.add(new PaymentUpcoming(R.drawable.phone_icon, "Phone Bill",
//                "88165445648", "Due Date:  11 june 2019", "Pay Now"));
//        paymentList.add(new PaymentUpcoming(R.drawable.telephone_icon, "Telephone Bill",
//                "82222222648", "Due Date:  25 august 2019", "Pay Now"));
//        paymentList.add(new PaymentUpcoming(R.drawable.train_icon, "Transport Bill",
//                "88111111648", "Due Date:  10 january 2019", "Pay Now"));
//
//
//        recyclerView = findViewById(R.id.recyclerView);
//        recyclerView.setHasFixedSize(true);
//        layoutManager = new LinearLayoutManager(this);
//        adapter = new PaymentAdapter(paymentList);
//
//        recyclerView.setLayoutManager(layoutManager);
//        recyclerView.setAdapter(adapter);
//
//    }



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        return super.onCreateView(inflater, container, savedInstanceState);

        return inflater.inflate(R.layout.fragment_home, container,false);










    }



}

