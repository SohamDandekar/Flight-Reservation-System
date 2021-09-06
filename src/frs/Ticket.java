package frs;

public class Ticket {

    private int pnrNumber;
    private String departureLocation;
    private String destinationLocation;
    private String dateAndTimeOfDeparture;
    private String dateAndTimeOfArrival;
    private int seatNumber;
    private Passenger passengerDetails;
    private float price;
    private String status;
    private Flight flightDetails;

    public Ticket(int pnrNumber, String departureLocation, String destinationLocation, String dateAndTimeOfDeparture, String dateAndTimeOfArrival, int seatNumber, Passenger passengerDetails, float price, String status, Flight flightDetails) {
        this.pnrNumber = pnrNumber;
        this.departureLocation = departureLocation;
        this.destinationLocation = destinationLocation;
        this.dateAndTimeOfDeparture = dateAndTimeOfDeparture;
        this.dateAndTimeOfArrival = dateAndTimeOfArrival;
        this.seatNumber = seatNumber;
        this.passengerDetails = passengerDetails;
        this.price = price;
        this.status = status;
        this.flightDetails = flightDetails;
    }

    public Ticket() {
    }

    public String checkStatus(){
        return status;
    }

    public void cancelTicket(){
        status = "Cancelled";
    }

    public String checkFlightDuration() {
        return flightDetails.getFlightDuration();
    }
}
