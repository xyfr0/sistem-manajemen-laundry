package com.example;

public class Item {
    private String item_id;
    private String item_name;
    private String item_category;
    private float weight_kg;
    private double unit_price;
    private int quantity;
    private double total_price;

    

    public Item(String item_id, String item_name, String item_category, float weight_kg, double unit_price,
            int quantity) {
        this.item_id = item_id;
        this.item_name = item_name;
        this.item_category = item_category;
        this.weight_kg = weight_kg;
        this.unit_price = unit_price;
        this.quantity = quantity;
        this.total_price = calcTotalPrice();
    }



    public double calcTotalPrice(){
        
        return 0;
    }

}
