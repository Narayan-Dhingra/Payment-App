package com.example.paymentapp.ui.offers;

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
import com.example.paymentapp.PaymentAdapter;
import com.example.paymentapp.R;
import com.example.paymentapp.RV.CurrentOffers;
import com.example.paymentapp.RV.PaymentUpcoming;

import java.util.ArrayList;


public class OffersFragment extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        return super.onCreateView(inflater, container, savedInstanceState);

        View rootView = inflater.inflate(R.layout.fragment_offers, container,false);

        ArrayList<CurrentOffers> offersList = new ArrayList<>();

        offersList.add(new CurrentOffers(R.drawable.special_offer, "Flipkart special cupon worth 5000"));
        offersList.add(new CurrentOffers(R.drawable.special_offer, "Flipkart special cupon worth 5000"));
        offersList.add(new CurrentOffers(R.drawable.special_offer, "Flipkart special cupon worth 5000"));
        offersList.add(new CurrentOffers(R.drawable.special_offer, "Flipkart special cupon worth 5000"));
        offersList.add(new CurrentOffers(R.drawable.special_offer, "Flipkart special cupon worth 5000"));
        offersList.add(new CurrentOffers(R.drawable.special_offer, "Flipkart special cupon worth 5000"));
        offersList.add(new CurrentOffers(R.drawable.special_offer, "Flipkart special cupon worth 5000"));
        offersList.add(new CurrentOffers(R.drawable.special_offer, "Flipkart special cupon worth 5000"));
        offersList.add(new CurrentOffers(R.drawable.special_offer, "Flipkart special cupon worth 5000"));

        recyclerView = rootView.findViewById(R.id.recyclerView1);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(oContext);
        adapter = new OffersAdapter(offersList);

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