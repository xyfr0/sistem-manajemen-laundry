package com.example;

import java.util.*;

public class Main {                

    public static void main(String[] args) {        
        List<ServiceType> serviceTypes = getServiceTypes();        
        Scanner in = new Scanner(System.in);
        System.out.println("Catat Data Laundry");
        System.out.println();
        System.out.println("Nama Pelanggan:");
        String customerName = in.next();
        System.out.println("Berat (kg):");
        float weightKg = in.nextFloat();
        System.out.println("Tipe Layanan (pilih dengan angka):");
        for(int i = 0; i < serviceTypes.size(); i++){            
            System.out.printf("%d. %s - Rp%.2f\n", i+1, serviceTypes.get(i).getService_name(), serviceTypes.get(i).getPrice_per_kg());                        
        }
        int num = in.nextInt();
        ServiceType selectedServiceType = serviceTypes.get(num-1);

    }

    static List<ServiceType> getServiceTypes(){
        List<ServiceType> serviceTypes = new ArrayList<>();
        serviceTypes.add(new ServiceType("S001", "Cuci & Setrika (Reguler)", 3, 6000));          
        serviceTypes.add(new ServiceType("S002", "Cuci & Setrika (Express)", 3, 12000));          
        serviceTypes.add(new ServiceType("S003", "Setrika (Reguler)", 3, 4000));          
        serviceTypes.add(new ServiceType("S004", "Setrika (Express)", 3, 8000));          
        serviceTypes.add(new ServiceType("S005", "Cuci & Lipat (Reguler)", 3, 4000));   
        serviceTypes.add(new ServiceType("S006", "Cuci & Lipat (Express)", 3, 8000));   
        return serviceTypes;
    }

    void getAdditionalItem(){

    }
}