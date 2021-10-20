package org.example;

public class Address {
    private int addressId;
    private String houseNo;
    private String city;

    public Address(int addressId, String houseNo, String city) {
        this.addressId = addressId;
        this.houseNo = houseNo;
        this.city = city;
        System.out.println("Address constructor called");
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressId=" + addressId +
                ", houseNo='" + houseNo + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
