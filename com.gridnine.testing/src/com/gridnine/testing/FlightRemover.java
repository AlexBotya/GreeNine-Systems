package com.gridnine.testing;

import java.util.ArrayList;
import java.util.List;

class FlightRemover {
    static List<Flight> removeFlightByOrdinalNumber(List<Flight> flights, ArrayList<Integer> arrayOfOrdinalNumber) {
        if (arrayOfOrdinalNumber.size() != 0) {
            ListConverter listConverter = new ListConverter();
            List<Flight> outputFlights;
            ArrayList<Flight> inputFlights;
            inputFlights = listConverter.convertListToArraylist(flights);

            for (int numForRemove : arrayOfOrdinalNumber) {
                inputFlights.remove(numForRemove);
            }
            outputFlights = listConverter.convertArrayListToList(inputFlights);
            return outputFlights;
        }
        return flights;
    }
}


