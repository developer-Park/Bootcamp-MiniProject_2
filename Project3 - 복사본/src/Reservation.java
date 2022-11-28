import java.time.LocalDateTime;

public class Reservation {
    private String reservationNumber;
    private String roomSize;
    private String customerName;
    private String customerPhoneNumber;
    private LocalDateTime reservationCreatedDate;

    public Reservation(String reservationNumber, String roomSize, String customerName, String customerPhoneNumber, LocalDateTime reservationCreatedDate) {
        this.reservationNumber = reservationNumber;
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
        return "Reservation{" +
                "roomSize='" + roomSize + '\'' +
                ", CustomerName='" + customerName + '\'' +
                ", CustomerPhoneNumber='" + customerPhoneNumber + '\'' +
                ", reservationCreatedDate=" + reservationCreatedDate +
                ", reservationNumber='" + reservationNumber + '\'' +
                '}';
    }
}
