package com.example.borgerkong;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Order {
    public static ArrayList<MenuItem> myOrder=new ArrayList<>();
    public static ArrayList<Integer> qtyOrdered=new ArrayList<>();
    public static double orderTotal=0.0;

    public static void addToOrder(MenuItem selectedItem, int qtyItem){
        myOrder.add(selectedItem);
        qtyOrdered.add(qtyItem);
        System.out.println(qtyItem);
        calculateOrderTotal();
    }
    public static void removeFromOrder(MenuItem selectedItem){
        int i = myOrder.indexOf(selectedItem);
        myOrder.remove(i);
        qtyOrdered.remove(i);
        calculateOrderTotal();
    }

    public static double calculateOrderTotal(){
        orderTotal=0.0;
        for (int i=0; i<myOrder.size();i++){
            orderTotal+=myOrder.get(i).getItemCost()*qtyOrdered.get(i);
        }
        return orderTotal;
    }
}
