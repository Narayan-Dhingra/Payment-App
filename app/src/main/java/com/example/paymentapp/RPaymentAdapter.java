package com.example.paymentapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.paymentapp.RV.PaymentRecent;
import com.example.paymentapp.RV.PaymentUpcoming;

import java.util.ArrayList;

public class RPaymentAdapter extends RecyclerView.Adapter<RPaymentAdapter.RPaymentViewHolder> {
    private ArrayList<PaymentRecent> rpaymentList;

    public static class RPaymentViewHolder extends RecyclerView.ViewHolder{
        public ImageView image;
        public TextView tv1;
        public TextView tv2;
        public TextView tv3;
        public TextView tv4;
        public TextView tv5;

        public RPaymentViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.ivRPayment);
            tv1 = itemView.findViewById(R.id.tvRName);
            tv2 = itemView.findViewById(R.id.tvRNo);
            tv3 = itemView.findViewById(R.id.tvRdate);
            tv4 = itemView.findViewById(R.id.tvSuccess);
            tv5 = itemView.findViewById(R.id.tvRAmount);

        }
    }

    public RPaymentAdapter(ArrayList<PaymentRecent> paymentList) {

        rpaymentList = paymentList;

    }



    @NonNull
    @Override
    public RPaymentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recent_payments, parent, false);
        RPaymentViewHolder pvh = new RPaymentViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(@NonNull RPaymentViewHolder holder, int position) {
        PaymentRecent currentItem = rpaymentList.get(position);

        holder.image.setImageResource(currentItem.getImage());
        holder.tv1.setText(currentItem.getTv1());
        holder.tv2.setText(currentItem.getTv2());
        holder.tv3.setText(currentItem.getTv3());
        holder.tv4.setText(currentItem.getTv4());
        holder.tv5.setText(currentItem.getTv5());

    }


    @Override
    public int getItemCount() {
       return (rpaymentList.size());
    }
}
