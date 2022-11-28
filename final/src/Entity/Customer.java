package Entity;

public class Customer {
    private String customerName;
    private String customerPhoneNumber;
    private int customerMoney;

    public Customer(String customerName, String customerPhoneNumber, int customerMoney) {

        this.customerName = customerName;
        this.customerPhoneNumber = customerPhoneNumber;
        this.customerMoney = customerMoney;
    }

    @Override
    public String toString() {
        return "Entity.Customer{" +
                "customerName='" + customerName + '\'' +
                ", customerPhoneNumber='" + customerPhoneNumber + '\'' +
                ", customerMoney=" + customerMoney +
                '}';
    }
}
