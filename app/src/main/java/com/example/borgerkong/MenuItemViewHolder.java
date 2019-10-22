package com.example.borgerkong;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.ColorInt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import static java.lang.Integer.parseInt;

public class MenuItemViewHolder extends RecyclerView.ViewHolder {
    public ConstraintLayout constraintMenuItem;
    public ImageView itemPic;
    public TextView itemName;
    public int itemID;
    public TextView itemCost;
    public TextView itemDescription;
    public Button addToOrder;
    public MenuItem selectedItem;


    public MenuItemViewHolder(View v){
        super(v);
        itemName =v.findViewById(R.id.itemName);
        itemPic = v.findViewById(R.id.itemPic);
        addToOrder=v.findViewById(R.id.addToOrder);
        //addToOrder.setVisibility(View.GONE);
        constraintMenuItem = v.findViewById(R.id.constraintMenuItem);
        constraintMenuItem.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent =new Intent(v.getContext(), MenuItemDetailActivity.class);
                intent.putExtra("ID",itemID);
                v.getContext().startActivity(intent);
            }
        });

    }
}
