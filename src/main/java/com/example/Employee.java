package com.example;

import java.time.LocalDateTime;
import java.util.*;

public class Employee {
    private String employee_id;
    private String employee_name;
    private String email;
    private String password;
    private String role; 

    public void createOrder(Order order, List<Order> orders){        
        orders.add(order);
    }



    

}
