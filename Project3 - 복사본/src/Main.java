import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        HotelService hotelService = new HotelService();
        CustomerService customerService = new CustomerService();
        RoomService rooms = new RoomService();


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
                    customerService.customerList();
                }

            } else if (a == 2) {
                System.out.print("룸 사이즈 : ");
                String roomSize = sc.next();
                System.out.print("고객이름 : ");
                String customerName = sc.next();
                System.out.print("고객 전화번호 :");
                String customerPhoneNumber = sc.next();
//                customerService.makingReservation(roomSize, customerName, customerPhoneNumber, rooms);
            } else if (a == 3) {
                System.out.println("전체객실 조회");
//                customerService.reservationList();

                hotelService.getAllList();
            } else if (a == 4) {
                System.out.print("예약번호 : ");
                String reservationNumber = sc.next();
//                customerService.checkCustomerOwnReservation(reservationNumber);

            } else if (a == 5) {
                System.out.print("예약번호 : ");
                String reservationNumber = sc.next();
//                customerService.deleteCustomerOwnReservation(reservationNumber, rooms);

            } else if (a == 6) {
                break;
            }else if (a== 0 ) {
                rooms.addRoom();
            }


        }

    }
}