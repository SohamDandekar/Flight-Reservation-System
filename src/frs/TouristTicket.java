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
        if(touristLocations.length < 5){
               touristLocations[touristLocations.length] = location;
        }
    }

    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public String[] getTouristLocations() {
        return touristLocations;
    }

    public void setTouristLocations(String[] touristLocations) {
        this.touristLocations = touristLocations;
    }

    public void deleteLocation(String location) {

        for(int i = 0; i < touristLocations.length; i++){

            if(touristLocations[i] == location){
                for(int j = i; j < touristLocations.length - 1; j++){
                    touristLocations[j] = touristLocations[j+1];
                }
                break;
            }
        }

        /* List<String> list = new ArrayList<String>(Arrays.asList(touristLocations));
        list.remove(location);
        touristLocations = list.toArray(new String[0]); */


    }
}
