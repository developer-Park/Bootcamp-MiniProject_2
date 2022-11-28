package Service;

import Entity.Customer;


import java.util.ArrayList;
import java.util.List;

public class HotelService {

    List<Customer> customer  ;

    public HotelService(List<Customer> customer) {
        this.customerService = customerService;
    }

    public void customerList() {
        for (Customer customer : customers) {
            System.out.println(customer.toString());
        }
    }
    }

