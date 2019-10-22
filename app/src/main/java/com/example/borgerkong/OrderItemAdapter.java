package com.example.borgerkong;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class OrderItemAdapter extends RecyclerView.Adapter<OrderItemViewHolder> {
    public ArrayList<MenuItem> myOrder;
    public OrderItemAdapter(ArrayList<MenuItem> myOrder){
        this.myOrder=myOrder;
    }
    @Override
    public OrderItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ordered_item_preview,parent,false);
        OrderItemViewHolder orderItemViewHolder= new OrderItemViewHolder(view);
        return orderItemViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull OrderItemViewHolder holder, int position) {
        //System.out.println(Order.qtyOrdered.get(0));
        MenuItem selectedItem = Order.myOrder.get(position);
        holder.itemName.setText(selectedItem.getItemName());
        holder.itemPic.setImageResource(selectedItem.getItemImage());
        holder.itemQty.setText(Integer.toString(Order.qtyOrdered.get(position)));
//        holder.itemID = position;
    }

    @Override
    public int getItemCount() {
        return Order.myOrder.size();
    }
}
