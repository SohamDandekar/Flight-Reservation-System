package frs;

public class Address {

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
