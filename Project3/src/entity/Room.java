package entity;

import java.util.ArrayList;
import java.util.List;

public class Room {
    private int roomNumber;
    private String roomSize;
    private int roomCharge;
    private String isBooked;



    public Room(int roomNumber, String roomSize, int roomCharge) {
        this.roomNumber = roomNumber;
        this.roomSize = roomSize;
        this.roomCharge = roomCharge;
        this.isBooked = "false";
    }
    public String getRoomSize() {
        return roomSize;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getRoomCharge() {
        return roomCharge;
    }
    public String getIsBooked() {
        return isBooked;
    }
    public void setIsBooked(String isBooked) {
        this.isBooked = isBooked;
    }
    @Override
    public String toString() {
        return "entity.Room{" +
                "roomNumber=" + roomNumber +
                ", roomSize='" + roomSize + '\'' +
                ", roomCharge=" + roomCharge +
                ", isBooked=" + isBooked +
                '}';
    }
}
