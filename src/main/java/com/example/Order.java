package com.example;

import java.time.*;

public class Order {
    private String order_id;
    private LocalDateTime order_date;
    private String customer_name;
    private LocalDateTime due_date;
    private double laundry_costs;
    private String fragrance_name;
    private float total_weight;
    private String status;
    private String payment_method;
    private String payment_status;
    private Item[] additionalItems;
    private int count = 0;

        



    public Order(String order_id, LocalDateTime order_date, String customer_name, LocalDateTime due_date, double laundry_costs,
            String fragrance_name, float total_weight, Item[] additionalItems) {
        this.order_id = generateOrderId();
        this.order_date = LocalDateTime.now();
        this.customer_name = customer_name;
        this.due_date = due_date;
        this.laundry_costs = laundry_costs;
        this.fragrance_name = fragrance_name;
        this.total_weight = total_weight;
        this.additionalItems = additionalItems;
    }





    String generateOrderId(){
        String id = null;
        String date = Integer.toString(LocalDateTime.now().getDayOfMonth());        
        String month = Integer.toString(LocalDateTime.now().getMonthValue());
        String year = Integer.toString(LocalDateTime.now().getYear()).substring(2);

        if (count < 10) {
            id = String.format("O%s%s%s00%s", year, month, date, Integer.toString(count));            
        } else if(count >= 10 && count < 100){
            id = String.format("O%s%s%s0%s", year, month, date, Integer.toString(count));
        } else if(count >= 100 && count < 1000){
            id = String.format("O%s%s%s%s", year, month, date, Integer.toString(count));
        }
        return id != null ? id : null;        
    }    

    

}
