package com.example.paymentapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.paymentapp.RV.PaymentUpcoming;

import java.util.ArrayList;

public class PaymentAdapter extends RecyclerView.Adapter<PaymentAdapter.PaymentViewHolder> {
    private ArrayList<PaymentUpcoming> upaymentList;

    public static class PaymentViewHolder extends RecyclerView.ViewHolder {
        public ImageView image;
        public TextView tv1;
        public TextView tv2;
        public TextView tv3;
        public TextView tv4;



        public PaymentViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.ivPayment);
            tv1 = itemView.findViewById(R.id.tvName);
            tv2 = itemView.findViewById(R.id.tvNo);
            tv3 = itemView.findViewById(R.id.tvDdate);
            tv4 = itemView.findViewById(R.id.tvPaynow);
        }
    }

    public PaymentAdapter(ArrayList<PaymentUpcoming> paymentList){
        upaymentList = paymentList;
    }

    @NonNull
    @Override
    public PaymentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.upcoming_payments, parent, false);
        PaymentViewHolder pvh = new PaymentViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(@NonNull PaymentViewHolder holder, int position) {
        PaymentUpcoming currentItem = upaymentList.get(position);

        holder.image.setImageResource(currentItem.getImage());
        holder.tv1.setText(currentItem.getTv1());
        holder.tv2.setText(currentItem.getTv2());
        holder.tv3.setText(currentItem.getTv3());
        holder.tv4.setText(currentItem.getTv4());


    }

    @Override
    public int getItemCount() {
        return upaymentList.size();
    }
}
