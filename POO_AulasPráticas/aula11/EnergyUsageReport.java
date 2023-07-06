package aula11;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class EnergyUsageReport {
    
    private Map<Integer, List<Double>> customerData;
    
    public EnergyUsageReport() {
        customerData = new HashMap<>();
    }
    
    public void load(String filename) {
        try {
            Scanner scanner = new Scanner(new File(filename));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split("\\|");
                int customerId = Integer.parseInt(parts[0].trim());
                List<Double> meterReadings = new ArrayList<>();
                for (int i = 1; i < parts.length; i++) {
                    double reading = Double.parseDouble(parts[i].trim());
                    meterReadings.add(reading);
                }
                customerData.put(customerId, meterReadings);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("Error: File not found");
        }
    }
    
    public void addCustomer(Customer customer) {
        customerData.put(customer.getCustomerId(), customer.getMeterReadings());
    }
    
    public void removeCustomer(int customerId) {
        customerData.remove(customerId);
    }
    
    public Customer getCustomer(int customerId) {
        List<Double> meterReadings = customerData.get(customerId);
        if (meterReadings == null) {
            return null;
        }
        return new Customer(customerId, meterReadings);
    }
    
    public double calculateTotalUsage(int customerId) {
        List<Double> meterReadings = customerData.get(customerId);
        if (meterReadings == null) {
            return 0;
        }
        double totalUsage = 0;
        for (Double reading : meterReadings) {
            totalUsage += reading;
        }
        return totalUsage;
    }
    
    public void generateReport(String filename) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            for (int customerId : customerData.keySet()) {
                double totalUsage = calculateTotalUsage(customerId);
                writer.printf("%d\t%.2f%n", customerId, totalUsage);
            }
        }
    }
}

