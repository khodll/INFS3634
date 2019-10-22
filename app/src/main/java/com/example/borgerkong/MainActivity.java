package com.example.borgerkong;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public int orderTotal;
    public ArrayList<MenuItem> myOrder = new ArrayList<>();
    public ArrayList<Integer> qtyOrdered = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView menuRecycler = findViewById(R.id.menuRecycler);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        menuRecycler.setLayoutManager(layoutManager);
        ArrayList<MenuItem> allMenu = MenuItem.generateItems();
        MenuItemAdapter menuItemAdapter=new MenuItemAdapter(allMenu);
        menuRecycler.setAdapter(menuItemAdapter);
    }
    public void onClickViewOrder(View view){
        Intent intent =new Intent(getApplicationContext(), ViewOrderActivity.class);
        intent.putExtra("ID",0);
        startActivity(intent);
    }

}
