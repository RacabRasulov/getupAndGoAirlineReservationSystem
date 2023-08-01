package com.example.getupandgoairlinereservationsystem.apiClasses;

import lombok.Data;

import java.util.ArrayList;

@Data
public class CustomData {

    public ArrayList<FlightsOfDeparture> flightsOfDeparture;
    public ArrayList<FlightsOfArrival> flightsOfArrival;
    public ArrayList<String> departureCityName;
    public ArrayList<String> arrivalCityName;
    public String uuid;

}
