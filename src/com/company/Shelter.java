package com.company;

public class Shelter {
    private String name;
    private String address;

    public Shelter() {
        setName("default name");
        setAddress("default address");
    }

    public Shelter(String name, String address) {
        this.name = name;
        this.address = address;
        System.out.println("Selter's name: " + getName() + "\n" +
                           "Shelter's address: " + getAddress() + "\n");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
