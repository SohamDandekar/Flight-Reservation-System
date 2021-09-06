package frs;

public class Flight {

    private int flightNumber;
    private String airline;
    private final int capacity;
    private int bookedSeatsCount;

    public Flight(int flightNumber, String airline, int capacity, int bookedSeatsCount, String flightDuration) {
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.capacity = capacity;
        this.bookedSeatsCount = bookedSeatsCount;
    }

    public Flight(int capacity) {
        this.capacity = capacity;
    }

    public String getFlightDetails(){
        String flightDetails = "Flight Number: " + flightNumber + "\n" +
                                "Airline: " + airline + "\n" +
                                "Seating capacity: " + this.capacity + "\n" +
                                "Number of seats booked: " + bookedSeatsCount + "\n";
        return flightDetails;
    }

    public int checkCapacity() {
        return this.capacity;
    }

    public boolean checkAvailability(){
        return this.capacity > 0;
    }

    public void bookSeat(){
        if(bookedSeatsCount < this.capacity){
            bookedSeatsCount++;
        }
    }


    public int getCapacity() {
        return this.capacity;
    }


    public int getBookedSeatsCount() {
        return bookedSeatsCount;
    }

    public void setBookedSeatsCount(int bookedSeatsCount) {
        this.bookedSeatsCount = bookedSeatsCount;
    }
}
