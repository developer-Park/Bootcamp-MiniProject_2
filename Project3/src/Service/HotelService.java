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

    public void getAllList() {
        System.out.println(customerService.reservationList());
    }

    public ArrayList<Room> addRoom() {
        Room singleroom = new Room(101, "single", 500);
        Room singleroom1 = new Room(102, "single", 500);
        Room singleroom2 = new Room(103, "single", 500);
        Room queenroom = new Room(201, "queen", 1000);
        Room queenroom1 = new Room(202, "queen", 1000);
        Room queenroom2 = new Room(203, "queen", 1000);
        Room queenroom3 = new Room(204, "queen", 1000);
        Room kingroom = new Room(301, "king", 2000);
        Room kingroom1 = new Room(302, "king", 2000);
        Room kingroom2 = new Room(303, "king", 2000);

        rooms.add(singleroom);
        rooms.add(singleroom1);
        rooms.add(singleroom2);
        rooms.add(queenroom);
        rooms.add(queenroom1);
        rooms.add(queenroom2);
        rooms.add(queenroom3);
        rooms.add(kingroom);
        rooms.add(kingroom1);
        rooms.add(kingroom2);

        System.out.println("Success add room.");
        return rooms;
    }


}