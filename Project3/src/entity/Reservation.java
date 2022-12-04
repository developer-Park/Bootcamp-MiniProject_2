package entity;

import java.time.LocalDateTime;
import java.util.UUID;

public class Reservation {
    private String reservationNumber;
    private String roomSize;
    private String customerName;
    private String customerPhoneNumber;
    private LocalDateTime reservationCreatedDate;


    public Reservation(String roomSize, String customerName, String customerPhoneNumber, LocalDateTime reservationCreatedDate ) {
        this.reservationNumber = UUID.randomUUID().toString();;
        this.roomSize = roomSize;
        this.customerName = customerName;
        this.customerPhoneNumber = customerPhoneNumber;
        this.reservationCreatedDate = reservationCreatedDate;
    }
    public String getCustomerName() {
        return customerName;
    }
    public String getReservationNumber() {
        return reservationNumber;
    }

    @Override
    public String toString() {
        return "entity.Reservation{" +
                "roomSize='" + roomSize + '\'' +
                ", CustomerName='" + customerName + '\'' +
                ", CustomerPhoneNumber='" + customerPhoneNumber + '\'' +
                ", reservationCreatedDate=" + reservationCreatedDate +
                ", reservationNumber='" + reservationNumber + '\'' +
                '}';
    }
}
