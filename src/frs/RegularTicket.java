package frs;

public class RegularTicket extends Ticket{
    private String[] specialServices;

    public RegularTicket(int pnrNumber, String departureLocation, String destinationLocation, String dateAndTimeOfDeparture, String dateAndTimeOfArrival, int seatNumber, Passenger passengerDetails, float price, Status status, Flight flightDetails, String[] specialServices) {
        super(pnrNumber, departureLocation, destinationLocation, dateAndTimeOfDeparture, dateAndTimeOfArrival, seatNumber, passengerDetails, price, status, flightDetails);
        this.specialServices = specialServices;
    }

    public void getTicketDetails(){
        super.getTicketDetails();
        System.out.println(checkSpecialServices());
    }

    public String checkSpecialServices() {
        String specialServices = "Selected Services: ";
        for(String ele: this.specialServices){
            specialServices = specialServices + ele + " ";
        }
        return specialServices;
    }

    public void updateSpecialServices(String[] specialServices) {
        this.specialServices = specialServices;
    }
}
