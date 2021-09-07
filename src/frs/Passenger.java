package frs;

public class Passenger {

    private static int idCounter;
    private int id;
    private boolean isRegistered;
    private Address address;
    private Contact contact;

    static {
        idCounter = 0;
    }

    public Passenger(boolean isRegistered, String addressStreet, String addressState, String addressCity, String contactName, int contactPhone, String contactEmail) {
        this.id = ++idCounter;
        this.isRegistered = isRegistered;
        this.address = new Address(addressStreet,addressState,addressCity);
        this.contact = new Contact(contactName,contactPhone,contactEmail);
    }

    private static class Address {

        private String street;
        private String state;
        private String city;

        public Address(String street, String state, String city) {
            this.street = street;
            this.state = state;
            this.city = city;
        }
    }

    private static class Contact {
        private String name;
        private int phoneNumber;
        private String emailId;

        public Contact(String name, int phoneNumber, String emailId) {
            this.name = name;
            this.phoneNumber = phoneNumber;
            this.emailId = emailId;
        }
    }

    public int getId() {
        return id;
    }

    public int getPassengerCount(){
        return idCounter;
    }

    public String getAddressDetails() {
        return address.street + ", " + address.city + ", " + address.state;
    }

    public String getContactDetails() {
        return contact.name + ", " + contact.phoneNumber + ", " + contact.emailId;
    }

    public void setAddressDetails(String street, String city, String state) {
        address.street = street;
        address.city = city;
        address.state = state;
    }

    public void setContactDetails(String name, int phoneNumber, String emailId) {
        contact.name = name;
        contact.phoneNumber = phoneNumber;
        contact.emailId = emailId;
    }
}
