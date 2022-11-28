import java.util.ArrayList;

public class RoomService {


    ArrayList<Room> rooms;
    //rooms에 101호, 102호 들어가있습니다.


    public RoomService() {
        this.rooms = new ArrayList<>();
    }

    public void addRoom() {
        Room queenroom = new Room(101, "queen", 1000);
        Room kingroom = new Room(102, "king", 2000);
        rooms.add(queenroom);
        rooms.add(kingroom);
        System.out.println("Room Add 완료");
    }

    public void searchRoom() {
        for (Room room : rooms) {
            System.out.println(room);
        }


    }
}

