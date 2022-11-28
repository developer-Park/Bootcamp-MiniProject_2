package Service;

import Entity.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {
    public List<Customer> customers = new ArrayList<Customer>();


    public void addCustomer(String customerName, String customerPhoneNumber, int customerMoney) {

        Customer customer = new Customer(customerName, customerPhoneNumber, customerMoney);
        customers.add(customer);
        System.out.println("Success add Entity.Customer. Thanks.");
    }

}