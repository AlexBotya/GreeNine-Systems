package com.gridnine.testing;

import java.util.ArrayList;
import java.util.List;

class ListConverter {
    public ArrayList<Flight> convertListToArraylist (List<Flight> flights){
        ArrayList<Flight> flightsConverted = new ArrayList<>();
        flightsConverted.addAll(flights);
        return flightsConverted;
    }

    public List<Flight> convertArrayListToList (ArrayList<Flight> flights){
        return (List) flights;
    }
}
