import Controller.CustomerController;
import Controller.HotelController;
import Entity.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CustomerController customerController = new CustomerController();
        HotelController hotelController = new HotelController();
        List<Customer> customer = new ArrayList<>();



        Scanner sc = new Scanner(System.in);

        System.out.println("1.게스트 추가");
        int a = sc.nextInt();

        if (a == 1) {
            System.out.print("고객이름 : ");
            String customerName = sc.next();
            System.out.print("고객 전화번호 :");
            String customerPhoneNumber = sc.next();
            System.out.print("고객이 가진돈 : ");
            int customerMoney = sc.nextInt();
            customerController.addCustomer(customerName, customerPhoneNumber, customerMoney);

            hotelController.customerList();



        }
    }
}
