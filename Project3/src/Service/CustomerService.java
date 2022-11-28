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

        if (OtherService.validPhoneNumber(customerPhoneNumber)) {
            for (Room room : rooms) {
                if (Objects.equals(roomSize, room.getRoomSize())) {
                    if (Objects.equals(room.getIsBooked(), "false")) {
                        for (Customer customer : customers) {
                            if (Objects.equals(customerName, customer.getCustomerName())) {
                                if (Objects.equals(customerPhoneNumber, customer.getCustomerPhoneNumber())) {
                                    if (customer.getCustomerMoney() >= room.getRoomCharge()) {
                                        String reservationNumber = UUID.randomUUID().toString();
                                        Reservation reservation = new Reservation(reservationNumber, room.getRoomSize(), customer.getCustomerName(), customer.getCustomerPhoneNumber(), createdAt);
                                        reservations.add(reservation);
                                        room.setIsBooked("true");
                                        customer.setCustomerMoney(customer.getCustomerMoney() - room.getRoomCharge());
                                        hotel.setHotelIncome(hotel.getHotelIncome() + room.getRoomCharge());
                                        System.out.println("고객 돈" + customer.getCustomerMoney());
                                        System.out.println("호텔 돈" + hotel.getHotelIncome());
                                        System.out.println("Success Booking." + reservations + room.getRoomNumber());
                                        break;

                                    } else {
                                        System.out.println("Failed Money");
                                    }
                                } else {
                                    System.out.println("Failed phone number");

                                }
                            } else {
                                System.out.println("Failed Name");

                            }
                        }
                        break;
                    } else {
                        System.out.println("예약된방");
                    }
                }
            }
        }
        //  }
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
