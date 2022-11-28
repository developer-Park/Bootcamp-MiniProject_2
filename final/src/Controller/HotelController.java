package Controller;

import Service.CustomerService;
import Service.HotelService;

public class HotelController {

    private CustomerService customerService;


    public HotelController(CustomerService customerService) {
        this.customerService = customerService;
    }

    public void customerList() {
        customerService.customerList();
    }
}
