package com.example.borgerkong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Integer.parseInt;

public class MenuItemDetailActivity extends AppCompatActivity {
    public int itemID;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_item_detail);
        Intent intent =getIntent();
        itemID =intent.getIntExtra("ID",0);
        System.out.println(itemID);
        ImageView itemPic = this.findViewById(R.id.itemPic);
        itemPic.setImageResource(MenuItem.allMenu.get(itemID).getItemImage());
        TextView itemName = this.findViewById(R.id.itemName);
        itemName.setText(MenuItem.allMenu.get(itemID).getItemName());
        TextView itemDescription = this.findViewById(R.id.itemDescription);
        itemDescription.setText(MenuItem.allMenu.get(itemID).getItemDescription());
        TextView itemCost = this.findViewById(R.id.itemCost);
        itemCost.setText("$"+String.format("%.2f",(MenuItem.allMenu.get(itemID).getItemCost())));
    }
    public void onClickPlus(View view){
        EditText qty = findViewById(R.id.qtyOrdered);
        int qtyOrdered = parseInt(qty.getText().toString());
        qtyOrdered++;
        qty.setText(Integer.toString(qtyOrdered));
    }
    public void onClickMinus(View view){
        EditText qty = findViewById(R.id.qtyOrdered);
        int qtyOrdered = parseInt(qty.getText().toString());
        if(qtyOrdered>1){
            qtyOrdered--;
        }
        qty.setText(Integer.toString(qtyOrdered));
    }
    public void onRemoveFromOrder (MenuItem selectedItem){
        Order.removeFromOrder(selectedItem);
        Order.calculateOrderTotal();
    }
    public void onAddToOrder(View view){
        EditText qty = findViewById(R.id.qtyOrdered);
        int qtyOrdered = parseInt(qty.getText().toString());
        //getindexof selecteditem in orderList. if null, add to orderlist. otherwise, add qty.
        Integer index = Order.myOrder.indexOf(MenuItem.allMenu.get(itemID));
        if (index != -1){
            int currentQty = Order.qtyOrdered.get(index);
            int newQty = currentQty+qtyOrdered;
            Order.qtyOrdered.set(index,newQty);
            Order.calculateOrderTotal();
        }
        else{
            Order.addToOrder(MenuItem.allMenu.get(itemID),qtyOrdered);
        }
        Toast.makeText(getApplicationContext(), "Item added", Toast.LENGTH_SHORT).show();
    }

}
