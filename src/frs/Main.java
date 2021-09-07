package frs;

public class Main {
    public static void main(String[] args){

        Flight flight = new Flight(987,"GoAir",150,0);
        Passenger passenger = new Passenger(true,"123A","Maharashtra","Thane","Sam",888888888,"sam@upgrad.com");
        TouristTicket touristTicket = new TouristTicket(5648,"Mumbai","Delhi","25/06/2021 20:08","25/06/2021 20:45",98,passenger,5000f,Status.Confirmed,flight,"Rajiv chowk, Delhi",new String[]{"Red Fort","Tajmahal","Qutab Minar","Lotus Temple"});
        RegularTicket regularTicket = new RegularTicket(7697,"Delhi","Mumbai","05/08/2021 19:35","05/08/2021 20:10",69,passenger,8000f,Status.Confirmed,flight,new String[]{"Water","Food"});


        System.out.println(flight.getFlightDetails());
        System.out.println(flight.checkAvailability());
        flight.bookSeat();
        System.out.println(flight.checkAvailability());


        System.out.println(passenger.getAddressDetails());
        System.out.println(passenger.getContactDetails());
        System.out.println(passenger.getPassengerCount());

        printTicketDetails(regularTicket);
        System.out.println(regularTicket.checkSpecialServices());
        String[] services = {"Water", "Snacks"};
        regularTicket.updateSpecialServices(services);
        System.out.println(regularTicket.checkSpecialServices());

        printTicketDetails(touristTicket);
        System.out.println(touristTicket.checkFlightDuration());
        System.out.println(touristTicket.getHotelAddress());
        System.out.println(touristTicket.getTouristLocations());

        touristTicket.addLocation("National Museum");
        touristTicket.addLocation("Akshardham");
        touristTicket.deleteLocation("Tajmahal");
        System.out.println(touristTicket.getTouristLocations());


    }

    public static void printTicketDetails(Ticket ticket){
        System.out.println("PNR Number: " + ticket.getPnrNumber());
    }

}
