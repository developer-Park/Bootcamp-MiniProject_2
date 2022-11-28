import java.util.ArrayList;
import java.util.List;

public class HotelService {
    CustomerService customerService;
    private Hotel hotel = new Hotel("A2", 100000,"1111");

    public HotelService() {

    }

    public void getAllList() {
       for (Customer customer : customerService.customerList());
        }
    }
