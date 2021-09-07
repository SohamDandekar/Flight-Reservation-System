package frs;

public abstract class Ticket {
    private int pnrNumber;
    private String departureLocation;
    private String destinationLocation;
    private String dateAndTimeOfDeparture;
    private String dateAndTimeOfArrival;
    private int seatNumber;
    private Passenger passengerDetails;
    private float price;
    private Status status;
    private Flight flightDetails;

    public Ticket(int pnrNumber, String departureLocation, String destinationLocation, String dateAndTimeOfDeparture, String dateAndTimeOfArrival, int seatNumber, Passenger passengerDetails, float price, Status status, Flight flightDetails) {
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

    public Status checkStatus(){
        return status;
    }

    public void cancelTicket(){
        status = Status.Cancelled;
    }


    public String checkFlightDuration() {
        /*
            dateAndTimeOfArrival will contain a string as "25/06/2021 19:35"
            split() will return a String array based on the split regex which is space in this case
            Then we use array indexing to access time and repeat the same process to obtain hour and minutes of departure and arrival
        */
        String dateArrival = dateAndTimeOfArrival.split(" ")[0];
        String dateDeparture = dateAndTimeOfDeparture.split(" ")[0];
        int arrivalHour = Integer.parseInt(dateAndTimeOfArrival.split(" ")[1].split(":")[0]);//20
        int departureHour = Integer.parseInt(dateAndTimeOfDeparture.split(" ")[1].split(":")[0]);//19
        int arrivalMinutes = Integer.parseInt(dateAndTimeOfArrival.split(" ")[1].split(":")[1]);//10
        int departureMinutes = Integer.parseInt(dateAndTimeOfDeparture.split(" ")[1].split(":")[1]);//35
        int resultHour,resultMinutes;

        if(arrivalHour > departureHour){
            if(dateArrival.equals(dateDeparture)){    //checking if flight departure and arrival are on same day
                resultHour = arrivalHour - departureHour - 1;
            }else{
                resultHour = 24 + (arrivalHour - departureHour) - 1; //flight lands the next day
            }
            resultMinutes = 60 - Math.abs(arrivalMinutes - departureMinutes);
        }else if(arrivalHour == departureHour){
            if(dateArrival.equals(dateDeparture)){    //checking if flight departure and arrival are on same day
                resultHour = 0;
                resultMinutes = arrivalMinutes - departureMinutes ;
            }else{
                resultHour = 24;      //flight lands the next day
                resultMinutes = Math.abs(arrivalMinutes - departureMinutes);
            }
        }else{            //flight lands the next day
            resultHour = 24 + (departureHour - arrivalHour) - 1;
            resultMinutes = 60 - Math.abs(arrivalMinutes - departureMinutes);
        }
        if(resultHour == 0){
            return resultMinutes + " Minutes";
        }else{
            return resultHour + " Hours " + resultMinutes + " Minutes";
        }
    }

    public void getTicketDetails(){
        String ticketDetails = "PNR Number: " + pnrNumber + "\n" +
                "Seat Number: " + seatNumber + "\n" +
                "Departure Location: " + departureLocation + "\n" +
                "Destination Location: " + destinationLocation + "\n" +
                "Departure Date & Time: " + dateAndTimeOfDeparture + "\n" +
                "Arrival Date & Time: " + dateAndTimeOfArrival + "\n" +
                "Price: " + price + "\n" +
                "Status: " + status;
        System.out.println(ticketDetails);
    }

    public int getPnrNumber() {
        return pnrNumber;
    }
}
