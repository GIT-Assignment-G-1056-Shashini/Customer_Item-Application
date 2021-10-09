package entity;

public class Customer {
    private String customerID;
    private String customerName;
    private String customerAddress;
    private int customerMobile;


    public Customer() {
    }

    public Customer(String customerID, String customerName, String customerAddress, int customerMobile) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.customerMobile = customerMobile;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public int getCustomerMobile() {
        return customerMobile;
    }

    public void setCustomerMobile(int customerMobile) {
        this.customerMobile = customerMobile;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerID='" + customerID + '\'' +
                ", customerName='" + customerName + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                ", customerMobile='" + customerMobile + '\'' +
                '}';
    }
}


