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

    private RecyclerView recyclerView1;
    private RecyclerView.Adapter adapter1;
    private RecyclerView.LayoutManager layoutManager1;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        return super.onCreateView(inflater, container, savedInstanceState);

        View rootView1 = inflater.inflate(R.layout.fragment_offers, container,false);

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

        recyclerView1 = rootView1.findViewById(R.id.recyclerView1);
        recyclerView1.setHasFixedSize(true);
        layoutManager1 = new LinearLayoutManager(oContext);
        adapter1 = new OffersAdapter(offersList);

        recyclerView1.setLayoutManager(layoutManager1);
        recyclerView1.setAdapter(adapter1);


        return rootView1;
    }

    Context oContext;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        this.oContext=context;
    }


}