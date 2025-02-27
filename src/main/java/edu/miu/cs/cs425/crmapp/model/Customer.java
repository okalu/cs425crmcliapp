package edu.miu.cs.cs425.crmapp.model;

import java.util.StringJoiner;

public class Customer {
    private Integer customerId;
    private String name;

    public Customer(Integer customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    public Customer() {
        this(null, null);
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Customer.class.getSimpleName() + "[", "]")
                .add("customerId=" + customerId)
                .add("name='" + name + "'")
                .toString();
    }
}
