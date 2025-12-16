package com.example;

import java.util.ArrayList;
import java.util.List;

public class Fragrance {
    private String fragrance_id;
    private String fragrance_name;
    
    public Fragrance(String fragrance_id, String fragrance_name) {
        this.fragrance_id = fragrance_id;
        this.fragrance_name = fragrance_name;
    }

    public Fragrance() {}
    
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

    public List<Fragrance> getFragrances() {
        List<Fragrance> fragrances = new ArrayList<>();
        fragrances.add(new Fragrance("F001", "Lavender"));
        fragrances.add(new Fragrance("F002", "Rose"));
        fragrances.add(new Fragrance("F003", "Ocean Fresh"));
        fragrances.add(new Fragrance("F004", "Vanilla"));
        fragrances.add(new Fragrance("F005", "Tanpa Pewangi"));
        return fragrances;
    }
    
}
