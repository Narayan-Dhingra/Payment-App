package com.example.paymentapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.paymentapp.RV.CurrentOffers;


import java.util.ArrayList;

public class OffersAdapter extends RecyclerView.Adapter<OffersAdapter.OffersViewHolder> {
    private ArrayList<CurrentOffers> uOfferList;

    public static class OffersViewHolder extends RecyclerView.ViewHolder {
        public ImageView image1;
        public TextView tv11;


        public OffersViewHolder(@NonNull View itemView) {
            super(itemView);
            image1 = itemView.findViewById(R.id.ivOffers);
            tv11 = itemView.findViewById(R.id.tvOffers);

        }
    }

    public OffersAdapter(ArrayList<CurrentOffers> offersList) {
        uOfferList = offersList;
    }

    @NonNull
    @Override
    public OffersViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v1 = LayoutInflater.from(parent.getContext()).inflate(R.layout.offers, parent, false);
        OffersViewHolder pvh1 = new OffersViewHolder(v1);
        return pvh1;
    }

    @Override
    public void onBindViewHolder(@NonNull OffersViewHolder holder1, int position) {
        CurrentOffers currentItem = uOfferList.get(position);

        holder1.image1.setImageResource(currentItem.getImage());
        holder1.tv11.setText(currentItem.getTv1());




    }

    @Override
    public int getItemCount() {
        return uOfferList.size();
    }
}
