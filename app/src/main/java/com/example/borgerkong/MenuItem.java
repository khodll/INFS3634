package com.example.borgerkong;

import android.widget.ImageView;

import java.util.ArrayList;

public class MenuItem {

    int itemID;
	String itemName;
	double itemCost;
	String itemDescription;
	int itemImage;

	public static ArrayList<MenuItem> allMenu = new ArrayList<>();
	public static ArrayList<MenuItem> generateItems(){
	    allMenu.add(new MenuItem(0,
                "Cheeseburger",
                5.50,
                "Classic combo of a flame-grilled Aussie beef patty topped with cheese, crunchy pickle, mustard and tomato sauce, served on a freshly toasted sesame seed bun. Basic - but brilliant.",
                R.drawable.cheeseburger));
        allMenu.add(new MenuItem(1,
                "Cheesy Loaded Chips",
                6.80,
                "Cheesy Loaded Chips – try our golden, crispy, Thick Cut Chips, topped with creamy cheesy sauce for a treat that’s bursting with taste and flavour. It’s the perfect topping for the chips you love.",
                R.drawable.cheesyloadedchips));
        allMenu.add(new MenuItem(2,
                "Grilled Chicken Caesar",
                8.80,
                "Flame grilled Aussie chicken breast and premium eye bacon, topped with creamy Caesar sauce, parmesan cheese, tomato and lettuce on a toasted sesame seed bun.",
                R.drawable.grilledchickencaesar));
        allMenu.add(new MenuItem(3,
                "Whopper",
                5.80,
                "Some things just can’t be improved. The Whopper® is 100% hormone-free Aussie beef, flame-grilled that gives you the irresistible smoky, BBQ flavour. Loaded with crisp fresh lettuce, ripe hand-cut tomatoes, onion, pickles, mayo and tomato sauce on a toasted sesame seed bun. An Aussie legend for over 40 years.",
                R.drawable.whopper));
        allMenu.add(new MenuItem(4,
                "Tendercrisp Caesar Wrap",
                5.80,
                "Aussie crispy chicken breast and double bacon, topped with creamy Caesar sauce, parmesan cheese, tomato and lettuce wrapped on a light and soft tortilla.",
                R.drawable.tendercrispwrap));
        allMenu.add(new MenuItem(5,
                "Grill Masters \n Ultimate Smoky BBQ Angus",
                13.80,
                "Taking burgers to the next level with our Grill Masters range. Double the flame-grilled, thicker, juicier 100% Aussie Angus beef, and double the cheese placed on an Artisan Brioche bun. Then stacked high with bacon, spicy angry onions, BBQ, mayo and cheddar cheese.",
                R.drawable.ultimatesmokybbqangus));
        allMenu.add(new MenuItem(6,
                "Vegan Muffin",
                5.80,
                "An English muffin with a veggie patty, vegan cheese, vegan mayonnaise, ketchup, fresh lettuce and tomato. Available until 11am",
                R.drawable.veganmuffin));
        allMenu.add(new MenuItem(7,
                "Thick Cut Chips",
                3.80,
                "Our thick cut chips are deliciously seasoned, delivering a crispier crunch on the outside, fluffy and hot on the inside. The chips are better at Hungry Jack's. Available in Small, Medium or Large.",
                R.drawable.thickcutchips));
        return allMenu;
    }

    public MenuItem(int itemID, String itemName, double itemCost, String itemDescription, int itemImage) {
        this.itemID = itemID;
        this.itemName = itemName;
        this.itemCost = itemCost;
        this.itemDescription = itemDescription;
        this.itemImage = itemImage;
    }
    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemCost() {
        return itemCost;
    }

    public void setItemCost(double itemCost) {
        this.itemCost = itemCost;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        itemDescription = itemDescription;
    }

    public int getItemImage() {
        return itemImage;
    }

    public void setItemImage(int itemImage) {
        this.itemImage = itemImage;
    }
}
