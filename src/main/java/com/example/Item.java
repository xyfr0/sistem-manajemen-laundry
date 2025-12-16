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



    public String getItem_id() {
        return item_id;
    }



    public void setItem_id(String item_id) {
        this.item_id = item_id;
    }



    public String getItem_name() {
        return item_name;
    }



    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }



    public String getItem_category() {
        return item_category;
    }



    public void setItem_category(String item_category) {
        this.item_category = item_category;
    }



    public float getWeight_kg() {
        return weight_kg;
    }



    public void setWeight_kg(float weight_kg) {
        this.weight_kg = weight_kg;
    }



    public double getUnit_price() {
        return unit_price;
    }



    public void setUnit_price(double unit_price) {
        this.unit_price = unit_price;
    }



    public int getQuantity() {
        return quantity;
    }



    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }



    public double getTotal_price() {
        return total_price;
    }



    public void setTotal_price(double total_price) {
        this.total_price = total_price;
    }

    

}
