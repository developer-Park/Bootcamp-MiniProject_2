package Presentation;

import Service.CustomerService;
import Service.HotelService;
import Service.OtherService;
import entity.Hotel;

import java.util.Scanner;

public class UI {
    public void display() {
        Scanner sc = new Scanner(System.in);

        Hotel hotel = new Hotel("A2", 100000, "1111");
        CustomerService customerService = new CustomerService();
        HotelService hotelService = new HotelService(customerService);
        OtherService otherService = new OtherService();
        hotelService.addRoom();

        while (true) {
            System.out.println("");
            System.out.println("1.게스트 추가");
            System.out.println("2.호텔 예약");
            System.out.println("3.호텔의 모든 예약조회");
            System.out.println("4.고객 자신의 예약조회");
            System.out.println("5.고객 자신의 예약취소");
            System.out.println("6.나가기");
            System.out.println("원하시는 번호 입력 : ");

            int a = sc.nextInt();
            if (a == 1) {
                System.out.print("고객이름 : ");
                String customerName = sc.next();
                System.out.print("고객 전화번호 :");
                String customerPhoneNumber = sc.next();
                if (OtherService.validPhoneNumber(customerPhoneNumber)) {
                    System.out.print("고객이 가진돈 : ");
                    int customerMoney = sc.nextInt();
                    customerService.addCustomer(customerName, customerPhoneNumber, customerMoney);
                    customerService.reservationList();
                }

            } else if (a == 2) {
                System.out.print("룸 사이즈 : ");
                String roomSize = sc.next();
                System.out.println("예약날짜");

                System.out.print("고객이름 : ");
                String customerName = sc.next();
                System.out.print("고객 전화번호 :");
                String customerPhoneNumber = sc.next();
                customerService.makingReservation(roomSize, customerName, customerPhoneNumber, hotel, hotelService.addRoom());
            } else if (a == 3) {
                System.out.println("전체객실 조회");
                hotelService.getAllList();
            } else if (a == 4) {
                System.out.print("예약번호 : ");
                String reservationNumber = sc.next();
                customerService.checkCustomerOwnReservation(reservationNumber);

            } else if (a == 5) {
                System.out.print("예약번호 : ");
                String reservationNumber = sc.next();
                customerService.deleteCustomerOwnReservation(reservationNumber, hotel,hotelService.addRoom());

            } else if (a == 6) {
                break;
            } else if (a == 0) {
                otherService.getSevenDate();
            }
        }

    }
}
