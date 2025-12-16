package com.example;

import java.time.*;
import java.util.*;

public class Order {
    private String order_id;
    private LocalDateTime order_date;
    private String customer_name;
    private LocalDateTime due_date;
    private double service_price;
    private double laundry_costs;
    private String fragrance_name;
    private float total_weight;
    private String status;
    private String payment_method;
    private String payment_status;
    private List<Item> additionalItems = new ArrayList<>();

    public Order(String order_id, String customer_name, double service_price,
            String fragrance_name, float total_weight, List<Item> additionalItems) {
        double itemCosts = 0;
        this.order_id = order_id;
        this.order_date = LocalDateTime.now();
        this.customer_name = customer_name;
        this.due_date = LocalDateTime.now();
        this.fragrance_name = fragrance_name;
        this.total_weight = total_weight;
        this.additionalItems = additionalItems;
        if (additionalItems != null) {
            for (int i = 0; i < additionalItems.size(); i++) {
                itemCosts += additionalItems.get(i).getTotal_price();
            }
        }
        this.laundry_costs = total_weight * service_price + itemCosts;
    }

}
