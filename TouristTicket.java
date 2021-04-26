package com.company;

public class TouristTicket {
    public String hotelAddress;
    public String[] selectedTouristLocation = new String[5];
    public String pnr;

    public TouristTicket(String hotelAddress,String [] selectedTouristLocation) {
        this.hotelAddress = hotelAddress;
        this.selectedTouristLocation=selectedTouristLocation;
    }

    public TouristTicket() {

    }

    public String getHotelAddress(){
        return hotelAddress;
    }
    public String [] getTouristLocations()
    {
        return selectedTouristLocation;
    }
    public String [] removeTouristLocation(){
       return selectedTouristLocation;

    }
    public void addTouristLocation(String location){

        int range= selectedTouristLocation.length;
        selectedTouristLocation[range-1]=location;
    }
}
