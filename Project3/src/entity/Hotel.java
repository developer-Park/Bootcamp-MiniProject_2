package entity;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    public String hotelName;
    private String password;
    private int hotelIncome;


    public int getHotelIncome() {
        return hotelIncome;
    }

    public void setHotelIncome(int hotelIncome) {
        this.hotelIncome = hotelIncome;
    }

    public Hotel(String hotelName, int hotelIncome, String password) {
        this.hotelName = hotelName;
        this.hotelIncome = hotelIncome;
        this.password = password;
    }


}