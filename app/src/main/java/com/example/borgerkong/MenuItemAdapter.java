package com.example.borgerkong;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import static java.lang.Integer.parseInt;

public class MenuItemAdapter extends RecyclerView.Adapter<MenuItemViewHolder> {
    public ArrayList<MenuItem> allMenu;
    public ConstraintLayout constraintMenuItem;
    public ImageView itemPic;
    public TextView itemName;
    public Button addToOrder;

    public MenuItemAdapter(ArrayList<MenuItem> allMenu){
        this.allMenu=allMenu;
        System.out.println("hello world");
    }

    @Override
    public MenuItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.menu_item_preview,parent,false);
        MenuItemViewHolder menuItemViewHolder= new MenuItemViewHolder(view);
        return menuItemViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MenuItemViewHolder holder, int position) {
        MenuItem selectedItem = allMenu.get(position);
        holder.itemName.setText(selectedItem.getItemName());
        holder.itemPic.setImageResource(selectedItem.getItemImage());
        holder.itemID = position;
        holder.selectedItem=selectedItem;
        /*
        holder.addToOrder.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                EditText qty = v.findViewById(R.id.qtyOrdered);
                int qtyOrdered = parseInt(qty.getText().toString());
                Order.addToOrder(selectedItem,qtyOrdered);
                Order.calculateOrderTotal();
                System.out.println("I have added "+qtyOrdered+" "+selectedItem.getItemName());
            }
        } );*/
        }

    @Override
    public int getItemCount() {
        return allMenu.size();
    }
}
