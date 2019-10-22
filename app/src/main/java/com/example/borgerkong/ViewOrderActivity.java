package com.example.borgerkong;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class ViewOrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_order);
        RecyclerView orderRecycler= findViewById(R.id.orderRecycle);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        orderRecycler.setLayoutManager(layoutManager);
        OrderItemAdapter orderItemAdapter=new OrderItemAdapter(Order.myOrder);
        orderRecycler.setAdapter(orderItemAdapter);
        TextView totalCost = findViewById(R.id.totalCost);
        totalCost.setText("Total Order  $"+String.format("%.2f",Order.orderTotal));

    }
}
