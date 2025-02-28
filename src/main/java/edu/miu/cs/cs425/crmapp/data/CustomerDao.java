package edu.miu.cs.cs425.crmapp.data;

import edu.miu.cs.cs425.crmapp.model.Customer;

@SuppressWarnings("LombokGetterMayBeUsed")
public class CustomerDao {
    private static CustomerDao instance;
    private final Customer[] customers;

    private CustomerDao() {
        customers = new Customer[]{
                new Customer(1001, "Anna Smith"),
                new Customer(2002, "Bob Jones")
        };
    }

    public static CustomerDao getInstance() {
        if(instance == null) {
            instance = new CustomerDao();
        }
        return instance;
    }

    public Customer[] getCustomers() {
        return customers;
    }
}
