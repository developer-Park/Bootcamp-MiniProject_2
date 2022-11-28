package Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OtherService {

    Calendar cal = java.util.Calendar.getInstance();
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    ArrayList dateList = new ArrayList();

    public void getSevenDate() {
        for(int i =0; i<7; i++) {
            cal.add(cal.DATE, +1);
            String dateStr = format.format(cal.getTime());
            dateList.add(dateStr);
        }
        System.out.println(dateList);
    }



    public static boolean validPhoneNumber(String number) {
        Pattern pattern = Pattern.compile("\\d{3}-\\d{4}-\\d{4}");
        Matcher matcher = pattern.matcher(number);
        if (matcher.matches()) {
            System.out.println("Valid phone number: " + number);
            return true;
        } else {
            System.out.println("Invalid. Not the form XXX-XXXX-XXX: " + number);
            return false;
        }
    }
}
