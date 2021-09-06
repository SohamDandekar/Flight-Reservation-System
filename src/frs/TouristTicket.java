package frs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TouristTicket {
    private String hotelAddress;
    private String[] touristLocations;

    public TouristTicket(String hotelAddress, String[] touristLocations) {
        this.hotelAddress = hotelAddress;
        this.touristLocations = touristLocations;
    }

    public TouristTicket() {
    }

    public void addLocation(String location) {
    /*
        Since array length can't be changed, length of touristLocations would be equal to the number of elements passed
        in the constructor.
        To add an element we convert the touristLocations array into a list and add the location to it.
     */
        List<String> list = new ArrayList<>(Arrays.asList(touristLocations));
        if(touristLocations.length < 5){
                list.add(location);
        }
        // Converting the list back to array
        String[] arr = new String[list.size()];
        list.toArray(arr);
        touristLocations = arr;
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
            touristLocations = touristLocations + ele + " ";
        }
        return touristLocations;
    }

    public void setTouristLocations(String[] touristLocations) {
        this.touristLocations = touristLocations;
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
