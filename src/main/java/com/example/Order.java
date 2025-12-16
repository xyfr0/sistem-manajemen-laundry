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

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public LocalDateTime getOrder_date() {
        return order_date;
    }

    public void setOrder_date(LocalDateTime order_date) {
        this.order_date = order_date;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public LocalDateTime getDue_date() {
        return due_date;
    }

    public void setDue_date(LocalDateTime due_date) {
        this.due_date = due_date;
    }

    public double getService_price() {
        return service_price;
    }

    public void setService_price(double service_price) {
        this.service_price = service_price;
    }

    public double getLaundry_costs() {
        return laundry_costs;
    }

    public void setLaundry_costs(double laundry_costs) {
        this.laundry_costs = laundry_costs;
    }

    public String getFragrance_name() {
        return fragrance_name;
    }

    public void setFragrance_name(String fragrance_name) {
        this.fragrance_name = fragrance_name;
    }

    public float getTotal_weight() {
        return total_weight;
    }

    public void setTotal_weight(float total_weight) {
        this.total_weight = total_weight;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPayment_method() {
        return payment_method;
    }

    public void setPayment_method(String payment_method) {
        this.payment_method = payment_method;
    }

    public String getPayment_status() {
        return payment_status;
    }

    public void setPayment_status(String payment_status) {
        this.payment_status = payment_status;
    }

    public List<Item> getAdditionalItems() {
        return additionalItems;
    }

    public void setAdditionalItems(List<Item> additionalItems) {
        this.additionalItems = additionalItems;
    }

    

}
