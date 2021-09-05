package frs;

import frs.Address;
import frs.Contact;

public class Passenger {

    private int id;
    private boolean isRegistered;
    private Address address;
    private Contact contact;

    public Passenger(int id, boolean isRegistered, Address address, Contact contact) {
        this.id = id;
        this.isRegistered = isRegistered;
        this.address = address;
        this.contact = contact;
    }

    public Passenger() {
    }

    public Address getAddress(){
        return address;
    }

    public Contact getContact(){
        return contact;
    }
}
