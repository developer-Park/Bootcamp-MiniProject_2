import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CustomerService {
    private List<Customer> customers;

    private int count;


    public CustomerService() {
        this.customers = new ArrayList<>();
    }


    public void customerList() {
        for (Customer customer : customers) {
            System.out.println(customer.toString());
    }

    public void addCustomer(String customerName, String customerPhoneNumber, int customerMoney) {
        count++;
        Customer customer = new Customer(count, customerName, customerPhoneNumber, customerMoney);
        customers.add(customer);
        System.out.println("Success add Customer. Thanks.");
    }
}