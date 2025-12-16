package com.example;

public class Fragrance {
    private String fragrance_id;
    private String fragrance_name;
    
    public Fragrance(String fragrance_id, String fragrance_name) {
        this.fragrance_id = fragrance_id;
        this.fragrance_name = fragrance_name;
    }

    public String getFragrance_id() {
        return fragrance_id;
    }

    public void setFragrance_id(String fragrance_id) {
        this.fragrance_id = fragrance_id;
    }

    public String getFragrance_name() {
        return fragrance_name;
    }

    public void setFragrance_name(String fragrance_name) {
        this.fragrance_name = fragrance_name;
    }

    
}
