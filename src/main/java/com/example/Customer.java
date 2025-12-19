package com.example;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String customer_id;
    private String customer_name;
    private String phone_number;
    private String date_regist;

    public Customer(String customer_id, String customer_name, String phone_number, String date_regist) {
        this.customer_id = customer_id;
        this.customer_name = customer_name;
        this.phone_number = phone_number;
        this.date_regist = date_regist;
    }

    public Customer() {}

    public String getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getDate_regist() {
        return date_regist;
    }

    public void setDate_regist(String date_regist) {
        this.date_regist = date_regist;
    }

    // TODO: Tambahkan metode untuk mendapatkan daftar pelanggan dari database
    public List<Customer> getCustomers() {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("C001", "Alice", "081234567890", "2024-01-15"));
        customers.add(new Customer("C002", "Bob", "089876543210", "2024-02-20"));
        customers.add(new Customer("C003", "Charlie", "082112233445", "2024-03-10"));
        customers.add(new Customer("C004", "Diana", "083998877665", "2024-04-05"));
        customers.add(new Customer("C005", "Ethan", "081122334455", "2024-05-18"));
        return customers;
    }
}
