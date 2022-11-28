
public class Customer {
    private int count;
    private String customerName;
    private String customerPhoneNumber;
    private int customerMoney;
    private Reservation reservations;

    public Customer(int count,String customerName, String customerPhoneNumber, int customerMoney) {
        this.count = count;
        this.customerName = customerName;
        this.customerPhoneNumber = customerPhoneNumber;
        this.customerMoney = customerMoney;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public int getCustomerMoney() {
        return customerMoney;
    }

    public void setCustomerMoney(int customerMoney) {
        this.customerMoney = customerMoney;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "count='" + count + '\'' +
                "customerName='" + customerName + '\'' +
                ", customerPhoneNumber='" + customerPhoneNumber + '\'' +
                ", customerMoney=" + customerMoney +
                '}';
    }
}
