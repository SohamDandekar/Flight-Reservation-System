package frs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TouristTicket extends Ticket{
    private String hotelAddress;
    private String[] touristLocations;

    public TouristTicket(int pnrNumber, String departureLocation, String destinationLocation, String dateAndTimeOfDeparture, String dateAndTimeOfArrival, int seatNumber, Passenger passengerDetails, float price, Status status, Flight flightDetails, String hotelAddress, String[] touristLocations) {
        super(pnrNumber, departureLocation, destinationLocation, dateAndTimeOfDeparture, dateAndTimeOfArrival, seatNumber, passengerDetails, price, status, flightDetails);
        this.hotelAddress = hotelAddress;
        this.touristLocations = touristLocations;
    }

    public void getTicketDetails(){
        super.getTicketDetails();
        System.out.println(getHotelAddress());
        System.out.println(getTouristLocations());
    }

    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public String getTouristLocations() {
        String touristLocations = "Selected Tourist Locations: ";
        for(String ele: this.touristLocations){
            touristLocations = touristLocations + ele + "  ";
        }
        return touristLocations;
    }

    public void setTouristLocations(String[] touristLocations) {
        this.touristLocations = touristLocations;
    }

    public void addLocation(String location) {
    /*
        Since array length can't be changed, length of touristLocations would be equal to the number of elements passed
        in the constructor.
        To add an element we convert the touristLocations array into a list and add the location to it.
     */
        if(touristLocations.length < 5){
            List<String> list = new ArrayList<>(Arrays.asList(touristLocations));
            list.add(location);
            // Converting the list back to array
            String[] arr = new String[list.size()];
            list.toArray(arr);
            touristLocations = arr;
            System.out.println("Added " + location);
        }else{
            System.out.println("Cannot select more than five locations.");
        }

    }

    public void deleteLocation(String location) {

    /* Outer for loop is used to loop through all locations in touristLocations
    *  When the location to delete is found, inner for loop overwrites that location with locations ahead of it in the array.
    */

        for(int i = 0; i < touristLocations.length; i++){

            if(touristLocations[i] == location){
                for(int j = i; j < touristLocations.length - 1; j++){
                    touristLocations[j] = touristLocations[j+1];
                }
                break;
            }
        }

        /* Though overwritten the array will still contain the same number of elements. So we use copyOfRange method to generate
        *  a new array with one element less and assign it to touristLocations.
        */
        touristLocations = Arrays.copyOfRange(touristLocations, 0, touristLocations.length -1);
    }
}
