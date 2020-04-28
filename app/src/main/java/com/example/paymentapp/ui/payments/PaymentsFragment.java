package com.example.paymentapp.ui.payments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.paymentapp.OffersAdapter;
import com.example.paymentapp.R;
import com.example.paymentapp.RPaymentAdapter;
import com.example.paymentapp.RV.CurrentOffers;
import com.example.paymentapp.RV.PaymentRecent;

import java.util.ArrayList;


public class PaymentsFragment extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        return super.onCreateView(inflater, container, savedInstanceState);

         View rootView = inflater.inflate(R.layout.fragment_payments, container,false);

        ArrayList<CurrentOffers> offersList = new ArrayList<>();

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

        recyclerView = rootView.findViewById(R.id.recyclerViewppp);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(oContext);
        adapter = new RPaymentAdapter(rpaymentList);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);


        return rootView;
    }

    Context oContext;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        this.oContext=context;
    }
}