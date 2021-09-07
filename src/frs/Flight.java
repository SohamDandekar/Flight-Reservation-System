package frs;

public class Flight {

    private int flightNumber;
    private String airline;
    private final int capacity;
    private int bookedSeatsCount;

    public Flight(int flightNumber, String airline, int capacity, int bookedSeatsCount) {
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
                                "Seating capacity: " + capacity + "\n" +
                                "Number of seats booked: " + bookedSeatsCount + "\n";
        return flightDetails;
    }

    public int checkCapacity() {
        return this.capacity;
    }

    public String checkAvailability(){
        if(bookedSeatsCount < capacity){
            return (capacity - bookedSeatsCount) + " seats available";
        }else{
            return "No seats available";
        }
    }

    public void bookSeat(){
        if(bookedSeatsCount < capacity){
            bookedSeatsCount++;
        }
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public int getBookedSeatsCount() {
        return bookedSeatsCount;
    }

    public void setBookedSeatsCount(int bookedSeatsCount) {
        this.bookedSeatsCount = bookedSeatsCount;
    }
}
