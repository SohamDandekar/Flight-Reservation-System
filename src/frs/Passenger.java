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

    public Passenger(boolean isRegistered, String addressStreet, String addressState, String adddressCity, String contactName, String contactPhone, String contactEmail) {
        this.id = ++idCounter;
        this.isRegistered = isRegistered;
        this.address = new Address(addressStreet,addressState,adddressCity);
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

        public Address() {
        }

        public String getAddressDetails(){
            String addressDetails = "Street: " + street + "\n" + "City: " + city + "\n" + "State: " + state;
            return addressDetails;
        }

        public void updateAddressDetails(String street, String city, String state){
            this.street = street;
            this.city = city;
            this.state = state;
        }
    }

    private static class Contact {
        private String name;
        private String phoneNumber;
        private String emailId;

        public Contact(String name, String phoneNumber, String emailId) {
            this.name = name;
            this.phoneNumber = phoneNumber;
            this.emailId = emailId;
        }

        public Contact() {
        }

        public String getContactDetails(){
            String contactDetails = "Name: " + name + "\n" + "Phone Number: " + phoneNumber + "\n" + "Email ID: " + emailId;
            return contactDetails;
        }

        public void updateContactDetails(String name, String phoneNumber, String emailId){
            this.name = name;
            this.phoneNumber = phoneNumber;
            this.emailId = emailId;
        }

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
}
