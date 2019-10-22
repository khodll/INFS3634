package com.example.borgerkong;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class OrderItemViewHolder extends RecyclerView.ViewHolder {
    public ConstraintLayout orderConstraint;
    public ImageView itemPic;
    public TextView itemName;
    public TextView itemQty;

    public OrderItemViewHolder(View v){
        super(v);
        itemName =v.findViewById(R.id.itemName);
        itemPic = v.findViewById(R.id.itemPic);
        itemQty = v.findViewById(R.id.qtyOrdered);
        orderConstraint= v.findViewById(R.id.orderConstraint);
        /*
        orderConstraint.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent =new Intent(v.getContext(), MenuItemDetailActivity.class);
                intent.putExtra("ID",itemID);
                v.getContext().startActivity(intent);
            }
        });
        */
    }
}
