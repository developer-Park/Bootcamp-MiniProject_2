package Controller;

import Service.CustomerService;

public class CustomerController {
//
    private CustomerService customerService = new CustomerService();

    public boolean addCustomer(String customerName, String customerPhoneNumber, int customerMoney) {
        customerService.addCustomer(customerName, customerPhoneNumber,customerMoney);
        return true;
    }

    public void customerList() {
        customerService.customerList();
    }
}
