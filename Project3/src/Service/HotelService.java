package Service;

import entity.Customer;
import entity.Room;

import java.util.ArrayList;
import java.util.List;

public class HotelService {

    CustomerService customerService;
    ArrayList<Room> rooms = new ArrayList<>();

    public HotelService(CustomerService customerService) {
        this.customerService = customerService;
    }

    public void getAllRoomList() {
        System.out.println(rooms);
    }

    public void getAllReservationList() {
        System.out.println(customerService.reservationList());
    }

    public ArrayList<Room> addRoom() {
        Room singleroom = new Room(101, "single", 500);
        Room queenroom = new Room(201, "queen", 1000);
        Room kingroom = new Room(301, "king", 2000);
        Room suiteroom = new Room(301, "suite", 3000);
        Room doubleroom = new Room(301, "double", 2500);
        rooms.add(singleroom);
        rooms.add(queenroom);
        rooms.add(kingroom);
        rooms.add(suiteroom);
        rooms.add(doubleroom);
        System.out.println("Success add room.");
        return rooms;
    }


}