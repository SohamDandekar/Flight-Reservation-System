package frs;

public class Flight {
//TODO: Update capacity related stuff since its static now.
    private int flightNumber;
    private String airline;
    private static int capacity;
    private int bookedSeatsCount;
    private String flightDuration;

    public Flight(int flightNumber, String airline, int capacity, int bookedSeatsCount, String flightDuration) {
        this.flightNumber = flightNumber;
        this.airline = airline;
        Flight.capacity = capacity;
        this.bookedSeatsCount = bookedSeatsCount;
        this.flightDuration = flightDuration;
    }

    public Flight() {
    }

    public String getFlightDetails(){
        String flightDetails = "Flight Number: " + flightNumber + "\n" +
                                "Airline: " + airline + "\n" +
                                "Seating capacity: " + Flight.capacity + "\n" +
                                "Number of seats booked: " + bookedSeatsCount + "\n" +
                                "Flight Duration: " + flightDuration;
        return flightDetails;
    }

    public int checkCapacity() {
        return Flight.capacity;
    }

    public boolean checkAvailability(){
        return Flight.capacity > 0;
    }

    public void bookSeat(){
        if(bookedSeatsCount < Flight.capacity){
            bookedSeatsCount++;
            Flight.capacity--;
        }
    }

    public String getFlightDuration() {
        return flightDuration;
    }

    public int getCapacity() {
        return Flight.capacity;
    }


    public int getBookedSeatsCount() {
        return bookedSeatsCount;
    }

    public void setBookedSeatsCount(int bookedSeatsCount) {
        this.bookedSeatsCount = bookedSeatsCount;
    }
}
