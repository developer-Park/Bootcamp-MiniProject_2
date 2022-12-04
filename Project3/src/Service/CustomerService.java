package Service;

import entity.Customer;
import entity.Hotel;
import entity.Reservation;
import entity.Room;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class CustomerService {
    private List<Customer> customers;
    public List<Reservation> reservations;
    private int count;
    private LocalDateTime createdAt;

    public CustomerService() {
        this.customers = new ArrayList<>();
        this.reservations = new ArrayList<>();
        this.createdAt = LocalDateTime.now();
        this.count = 0;
    }

    public List<Reservation> reservationList() {
        return reservations;
    }

    public void addCustomer(String customerName, String customerPhoneNumber, int customerMoney) {
        count++;
        Customer customer = new Customer(count, customerName, customerPhoneNumber, customerMoney);
        customers.add(customer);
        System.out.println("Success add entity.Customer. Thanks.");
    }
    public void makingReservation(String roomSize, String customerName, String customerPhoneNumber, Hotel hotel, List<Room> rooms) {
        for (Room room : rooms) { // 룸리스트 돌면서 방찾기
            if (!Objects.equals(roomSize, room.getRoomSize())) continue;  // 방 사이즈가 다르면 pass
            if (Objects.equals(room.getIsBooked(), "true"))  { // 방 사이즈가 일치하지만 이미 예약된 경우
                System.out.println("방 이미 예약됨");
                break; // 룸리스트 반복문 바로 끝
            }

            // 이제 방 사이즈도 일치하고, 방도 비어있다!
            // 손님리스트 돌면서 손님찾고, 예약 시작
            // 맞는 손님을 찾기보다, 아닌 손님 돌려보내기.

            for (Customer customer : customers) { // 손님리스트 돌면서
                if (!Objects.equals(customerName, customer.getCustomerName())) continue; // 이름 다르면 pass
                if (!Objects.equals(customerPhoneNumber, customer.getCustomerPhoneNumber())) continue; // 전번 다르면 pass

                // 이름 전번 다 일치하지만, 돈이 부족한 경우
                if (customer.getCustomerMoney() < room.getRoomCharge()) {
                    System.out.println("Not enough money"); //
                    break; // 손님리스트 반복문 끝
                }

                // 이름과 전번도 같고 돈도 충분한 경우
//                String reservationNumber = UUID.randomUUID().toString(); // uuid 발급받아서

                // 예약 생성
                Reservation reservation = new Reservation(room.getRoomSize(), customer.getCustomerName(), customer.getCustomerPhoneNumber(), createdAt);
                reservations.add(reservation); // 예약 생성한거 리스트에 추가
                room.setIsBooked("true"); // 예약상태 트루로 바꿈

                customer.setCustomerMoney(customer.getCustomerMoney() - room.getRoomCharge()); // 손님 돈 계산
                hotel.setHotelIncome(hotel.getHotelIncome() + room.getRoomCharge()); // 호텔 돈 계산

                // 출력
                System.out.println("고객 돈" + customer.getCustomerMoney());
                System.out.println("호텔 돈" + hotel.getHotelIncome());
                System.out.println("Success Booking." + reservations + room.getRoomNumber());

                break; // 예약 완료. 손님리스트 반복문 끝
            } // customers 반복문 끝

            // 사이즈 일치하는 빈방 찾았고, 손님리스트 다 돌았지만, 일치하는 손님이 없는 경우.
            System.out.println("고객 정보를 다시 확인해주세요.");
            break; // 굳이 다른 방 더 볼 필요 없음.

        } // rooms 반복문 끝
    }

    public void checkCustomerOwnReservation(String reservationNumber) {
        for (Reservation reservation : reservations) {
            if (Objects.equals(reservationNumber, reservation.getReservationNumber())) {
                System.out.println(reservation.toString());
            }
        }
    }

    public void deleteCustomerOwnReservation(String reservationNumber, Hotel hotel, List<Room> rooms) {
        for (int i = reservations.size() - 1; i >= 0; i--) {
            Reservation reservationList = reservations.get(i);
            if (reservationNumber.equals(reservationList.getReservationNumber())) {
                reservations.remove(reservationList);
                for (Room room : rooms) {
                    for (Customer customer : customers) {
                        System.out.println(reservationList.getCustomerName()); //park1
                        System.out.println(customer.getCustomerName()); //park
                        if (customer.getCustomerName().equals(reservationList.getCustomerName())) {
                            room.setIsBooked("false");
                            customer.setCustomerMoney(customer.getCustomerMoney() + room.getRoomCharge());
                            hotel.setHotelIncome(hotel.getHotelIncome() - room.getRoomCharge());
                            System.out.println("고객 돈" + customer.getCustomerMoney());
                            System.out.println("호텔 돈" + hotel.getHotelIncome());
                            System.out.println("예약취소완료");
                        }
                    }
                    break;
                }
            }
        }
    }
}
