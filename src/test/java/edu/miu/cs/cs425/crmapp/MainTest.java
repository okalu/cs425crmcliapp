package edu.miu.cs.cs425.crmapp;

import edu.miu.cs.cs425.crmapp.model.Customer;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private Main main;

    @BeforeEach
    void setUp() {
        main = new Main();
    }

    @AfterEach
    void tearDown() {
        main = null;
    }

    @Test
    void testFindCustomerById_when_exist() {
        Integer customerId = 1001;
        Customer customer = main.findCustomerById(customerId);
        assertNotNull(customer);
    }

    @Test
    void testFindCustomerById_when_not_exist() {
        Integer customerId = 1003;
        Customer customer = main.findCustomerById(customerId);
        assertNull(customer);
    }
}