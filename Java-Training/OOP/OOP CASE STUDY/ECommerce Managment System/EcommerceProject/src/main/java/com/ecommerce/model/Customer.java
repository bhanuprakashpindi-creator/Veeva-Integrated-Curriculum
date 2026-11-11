package com.ecommerce.model;

public class Customer {
    private int customer_id;
    private String name;
    private String email;
    private String phone;
    private String address;
    private String city;
    private String password;

    public int getCustomer_id()
    {
        return customer_id;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Customer(int customer_id, String name, String email, String phone, String address, String city) {

        //check the customer_id in sql to validate the user
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.city = city;
    }

    public Customer(String name, String email, String phone, String address, String city) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.city = city;
    }

    @Override
    public String toString() {
        return "com.ecommerce.model.Customer{" +
                "customer_id=" + customer_id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
