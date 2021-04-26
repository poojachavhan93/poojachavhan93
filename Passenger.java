package com.company;

public class Passenger {
    private final Object Address;
    private final Object Contact;
    public int id;
    public Address address;
    public Contact contact;

    public Passenger(int id, Address address, Contact contact) {
        this.id = id;
        Address = address;
        Contact = contact;
    }


    public Address getAddress() {
        return address;
    }

    public Contact getContact() {
        return contact;
    }
}
