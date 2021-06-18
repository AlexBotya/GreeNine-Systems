package com.gridnine.testing;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

class FinderFlightWhereGroundTimeMoreThanTwoHours extends FlightRemover implements FinderOrdinalNumberOfFlight {
    @Override

    public ArrayList<Integer> find(List<Flight> flights) {
        ArrayList<Integer> arrayOfOrdinalNumber = new ArrayList<>();
        for (int i = 0; i < flights.size(); i++) {
            List<Segment> tempFlight = flights.get(i).getSegments();
            if (tempFlight.size() > 1) {
                for (int j = 0; j < (tempFlight.size() - 1); j++) {
                    int duration = (int) Duration.between(tempFlight.get(j).getArrivalDate(), tempFlight.get(j + 1).getDepartureDate()).toHours();
                    if (duration > 2) {
                        arrayOfOrdinalNumber.add(i);
                        break;
                    }
                }
            }
        }
        return arrayOfOrdinalNumber;
    }
}

