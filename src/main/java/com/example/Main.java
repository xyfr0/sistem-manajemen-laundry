package com.example;

import java.util.*;

public class Main {
    
    static void printInvoiceSementara(Order order, ServiceType st, int roundedWeight) {
        System.out.println("\n========================================================");
        System.out.println("Catat Data Laundry");
        System.out.println("========================================================");
        System.out.println();
        System.out.printf("Nama Pelanggan:\n%s\n\n", order.getCustomer_name());
        System.out.printf("Berat Laundry:\n%.1f\n", order.getTotal_weight());
        System.out.println("Berat dibulatkan ke atas: " + roundedWeight + " kg");
        System.out.printf("\nTipe Layanan:\n%s - Rp %.0f/kg\n\n", st.getService_name(), st.getPrice_per_kg());
        System.out.printf("Jenis Pewangi:\n%s\n\n", order.getFragrance_name());
        System.out.println("Item Tambahan:");
        System.out.println("Tidak ada item tambahan");
        System.out.println("\n========================================================\n");
        // Hitung total estimasi
        double totalEstimation = roundedWeight * st.getPrice_per_kg();
        System.out.printf("Total Estimasi:\t\t\t\t   Rp %.0f\n", totalEstimation);
    }
    public static void main(String[] args) {
        Order order = new Order();
        Customer customer = new Customer();
        List<Customer> customers = customer.getCustomers();
        ServiceType serviceType = new ServiceType();
        List<ServiceType> serviceTypes = serviceType.getServiceTypes();
        Fragrance fragrance = new Fragrance();
        List<Fragrance> fragrances = fragrance.getFragrances();
        Item item = new Item();
        List<Item> items = item.getItems();
        int count = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("========================================================");
        System.out.println("Catat Data Laundry");
        System.out.println("========================================================");
        System.out.println();

        System.out.println("Nama Pelanggan:");
        String customerName = in.nextLine();
        // Validate customer name input
        while (customerName.trim().isEmpty()) {
            System.out.println("Nama tidak boleh kosong\n");
            System.out.println("Nama Pelanggan:");
            customerName = in.nextLine();
        }
        // Validasi apakah nama pelanggan ada dalam data pelanggan
        final String trimmedCustomerName = customerName.trim();
        boolean customerExists = customers.stream()
            .anyMatch(c -> c.getCustomer_name().trim().equalsIgnoreCase(trimmedCustomerName));

        if (!customerExists) {
            System.out.println("\nNama pelanggan tidak ditemukan dalam data. Silakan buat akun pelanggan terlebih dahulu.");
            in.close();
            return;
        }

        float weightKg = -1;
        while (weightKg < 0.1f) {
            System.out.println("\nBerat (kg):");
            String input = in.nextLine().trim();
            // Validasi input berat
            if (input.isEmpty()) {
                System.out.println("Berat tidak boleh kosong, minimal 0.1");
            } else {
                try {
                    weightKg = Float.parseFloat(input);
                    if (weightKg < 0.1f) {
                        System.out.println("Berat tidak boleh kosong, minimal 0.1");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Input tidak valid. Masukkan angka.");
                }
            }
        }

        // Pembulatan ke atas berat laundry
        int roundedWeight = (int) Math.ceil(weightKg);
        System.out.println("Berat dibulatkan ke atas: " + roundedWeight + " kg");

        System.out.println("\nTipe Layanan:");
        for (int i = 0; i < serviceTypes.size(); i++) {
            System.out.printf("%d. %s - Rp%.0f\n", i + 1, serviceTypes.get(i).getService_name(),
                    serviceTypes.get(i).getPrice_per_kg());
        }
        System.out.print("\nPilih tipe layanan sesuai dengan opsi yang tersedia: ");
        int num = in.nextInt();
        if (num < 1 || num > serviceTypes.size()) {
            System.out.println("Input tidak valid. Menggunakan opsi default: " + serviceTypes.get(0).getService_name());
            num = 1; // Default : opsi 1
        }
        ServiceType selectedServiceType = serviceTypes.get(num - 1);

        
        System.out.println("\njenis Pewangi:");
        for (int i = 0; i < fragrances.size(); i++) {
            System.out.printf("%d. %s\n", i + 1, fragrances.get(i).getFragrance_name());
        }
        System.out.print("\nPilih jenis pewangi sesuai dengan opsi yang tersedia: ");
        int numFra = in.nextInt();
        if (numFra < 1 || numFra > fragrances.size()) {
            System.out.println("Input tidak valid. Menggunakan opsi default: " + fragrances.get(0).getFragrance_name());
            numFra = 1; // Default : opsi 1
        }
        String fragName = fragrances.get(numFra - 1).getFragrance_name();
        


        // Output
        Order orderr = new Order(order.generateOrderId(count), customerName, weightKg, selectedServiceType.getPrice_per_kg(), fragName, items);
        printInvoiceSementara(orderr, selectedServiceType, roundedWeight);

        in.close();
    }
}