package edu.miu.cs.cs425.crmapp;

import edu.miu.cs.cs425.crmapp.data.CustomerDao;
import edu.miu.cs.cs425.crmapp.model.Customer;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!%n");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
        var customers = CustomerDao.getInstance().getCustomers();
        // TODO Add new Customer
        Arrays.stream(customers)
                .forEach(System.out::println);
    }

    public Customer findCustomerById(Integer customerId) {
        var customers = CustomerDao.getInstance().getCustomers();
        return Arrays.stream(customers)
                .filter(c -> c.getCustomerId().equals(customerId))
                .findFirst()
                .orElse(null);
    }
}