package com.example;

public class ServiceType {
    private String service_type_id;
    private String service_name;
    private int duration_days;
    private double price_per_kg;

    
    public ServiceType(String service_type_id, String service_name, int duration_days, double price_per_kg) {
        this.service_type_id = service_type_id;
        this.service_name = service_name;
        this.duration_days = duration_days;
        this.price_per_kg = price_per_kg;
    }


    public String getService_type_id() {
        return service_type_id;
    }


    public void setService_type_id(String service_type_id) {
        this.service_type_id = service_type_id;
    }


    public String getService_name() {
        return service_name;
    }


    public void setService_name(String service_name) {
        this.service_name = service_name;
    }


    public int getDuration_days() {
        return duration_days;
    }


    public void setDuration_days(int duration_days) {
        this.duration_days = duration_days;
    }


    public double getPrice_per_kg() {
        return price_per_kg;
    }


    public void setPrice_per_kg(double price_per_kg) {
        this.price_per_kg = price_per_kg;
    }

    
}
