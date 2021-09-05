package frs;

public class Contact {
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

