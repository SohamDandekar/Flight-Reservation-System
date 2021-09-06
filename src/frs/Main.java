package frs;

public class Main {
    public static void main(String[] args){
        Flight flight = new Flight(123,"GoAir",150,100,"2 hours 30 minutes");
        /* System.out.println(flight.getFlightDuration());
        System.out.println(flight.getFlightDetails());
        flight.bookSeat();
        System.out.println(flight.getCapacity());
        System.out.println(flight.getBookedSeatsCount()); */

        /* Address address = new Address("123","Mumbai","Mh");
        Contact contact = new Contact("Soham","999999","s@y.com");
        /* System.out.println(contact.getContactDetails());
        contact.updateContactDetails("Pratik","888888","p@g.com");
        System.out.println(contact.getContactDetails()); */

        //Passenger passenger = new Passenger(1,true,address,contact);

        //Ticket ticket = new Ticket(1234,"NewYork","Mumbai","25th Jan 12.00 pm","26th Jan 06.00 am",56,passenger,500,"Booked",flight);

        /* Contact contact = new Contact("Soham","999999","s@y.com");
        System.out.println(contact.getContactDetails());
        contact.updateContactDetails("Pratik","888888","p@g.com");
        System.out.println(contact.getContactDetails()); */

         TouristTicket touristTicket = new TouristTicket("N,A east",new String[]{"M","A","E"});
        System.out.println(touristTicket.getHotelAddress());
        System.out.println(touristTicket.getTouristLocations());
        touristTicket.addLocation("Q");
        System.out.println(touristTicket.getTouristLocations());
        touristTicket.deleteLocation("M");
        System.out.println(touristTicket.getTouristLocations());
    }
}
