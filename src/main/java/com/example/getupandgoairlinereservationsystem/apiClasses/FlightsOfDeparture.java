package com.example.getupandgoairlinereservationsystem.apiClasses;

import lombok.Data;

import java.util.ArrayList;

@Data
public class FlightsOfDeparture {
    public String flightDate;
    public String fare;
    public String currency;
    public ArrayList<FlightInfoDetailList> flightInfoDetailList;
}
