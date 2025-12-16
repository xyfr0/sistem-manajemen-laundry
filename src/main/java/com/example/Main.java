package com.example;

import java.time.LocalDateTime;
import java.util.*;

public class Main {    

    public static void main(String[] args) {
        Employee employee = new Employee();
        List<Order> orders = new ArrayList<>();
        List<ServiceType> serviceTypes = getServiceTypes(); 
        List<Item> itemsList = new ArrayList<>();
        List<Fragrance> fragrances = getFragrances();
        int count = 0;
        
        Scanner in = new Scanner(System.in);
        System.out.println("Catat Data Laundry");
        System.out.println();
        System.out.println("Nama Pelanggan:");
        String customerName = in.next();
        System.out.println("Berat (kg):");
        float weightKg = in.nextFloat();
        System.out.println("Tipe Layanan (pilih dengan angka):");
        for (int i = 0; i < serviceTypes.size(); i++) {
            System.out.printf("%d. %s - Rp%.2f\n", i + 1, serviceTypes.get(i).getService_name(),
                    serviceTypes.get(i).getPrice_per_kg());
        }
        int num = in.nextInt();
        ServiceType selectedServiceType = serviceTypes.get(num - 1);

        System.out.println("Pilih pewangi:");
        
        for (int i = 0; i < fragrances.size(); i++) {
            System.out.printf("%d. %s\n", i + 1, fragrances.get(i).getFragrance_name());
        }

        int numFra = in.nextInt();
        String fragName = fragrances.get(numFra-1).getFragrance_name();

        // System.out.println("Pilih item tambahan:");
        // List<Item> items = getItems();
        // while (true) {
        //     for (int i = 0; i < items.size(); i++) {
        //         System.out.printf("%d. %s - Rp%.2f\n", i + 1, items.get(i).getItem_name(),
        //                 items.get(i).getUnit_price());
        //     }
        //     System.out.println("0. Lewati");
        //     int num2 = in.nextInt();
        //     if (num2 == 0) {
        //         break;
        //     } else{
        //         itemsList.add(items.get(num2-1));
        //     }

        // }                
        Order order = new Order(generateOrderId(count), customerName, selectedServiceType.getPrice_per_kg(), "Vanilla", weightKg, itemsList);
        printInvoice(order, selectedServiceType);

    }

    static List<ServiceType> getServiceTypes() {
        List<ServiceType> serviceTypes = new ArrayList<>();
        serviceTypes.add(new ServiceType("S001", "Cuci & Setrika (Reguler)", 3, 6000));
        serviceTypes.add(new ServiceType("S002", "Cuci & Setrika (Express)", 3, 12000));
        serviceTypes.add(new ServiceType("S003", "Setrika (Reguler)", 3, 4000));
        serviceTypes.add(new ServiceType("S004", "Setrika (Express)", 3, 8000));
        serviceTypes.add(new ServiceType("S005", "Cuci & Lipat (Reguler)", 3, 4000));
        serviceTypes.add(new ServiceType("S006", "Cuci & Lipat (Express)", 3, 8000));
        return serviceTypes;
    }

    static List<Item> getItems() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("I001", "Gorden", "", 0, 10000, 0));
        items.add(new Item("I002", "Bed Cover Tebal", "", 0, 35000, 0));
        items.add(new Item("I003", "Bed Cover Sedang", "", 0, 25000, 0));
        items.add(new Item("I004", "Bed Cover Kecil", "", 0, 20000, 0));
        items.add(new Item("I005", "Selimut Tebal", "", 0, 40000, 0));
        items.add(new Item("I006", "Selimut Sedang", "", 0, 35000, 0));
        items.add(new Item("I007", "Selimut Kecil", "", 0, 30000, 0));
        return items;
    }
    
    static List<Fragrance> getFragrances(){
        List<Fragrance> fragrances = new ArrayList<>();
        fragrances.add(new Fragrance("F001", "Lavender"));
        fragrances.add(new Fragrance("F002", "Rose"));
        fragrances.add(new Fragrance("F003", "Ocean Fresh"));
        fragrances.add(new Fragrance("F004", "Vanilla"));
        fragrances.add(new Fragrance("F005", "Tanpa Pewangi"));
        return fragrances;
    }

    static String generateOrderId(int count){
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
        count++;
        return id != null ? id : null;        
    }   

    static void printInvoice(Order order, ServiceType st){
        System.out.println("=============================================");
        System.out.println("Catat Data Laundry");
        System.out.println("=============================================");
        System.out.println();
        System.out.printf("Nama Pelanggan:\n %s\n\n", order.getCustomer_name());
        System.out.printf("Berat Laundry:\n %.1f\n\n", order.getTotal_weight());
        System.out.printf("Tipe Layanan:\n %s\n\n", st.getService_name());
        System.out.printf("Jenis Pewangi:\n %s\n\n", order.getFragrance_name());
        System.out.println("Item Tambahan:");
        if (order.getAdditionalItems() == null) {
            System.out.println("Tidak Ada Item Tambahan");
        } else{
            for(int i = 0; i < order.getAdditionalItems().size(); i++){
                System.out.printf("%s - %d", order.getAdditionalItems().get(i).getItem_name(), order.getAdditionalItems().get(i).getQuantity());
            }
        }
    }

}