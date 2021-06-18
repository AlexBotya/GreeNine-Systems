package com.gridnine.testing;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

class FinderFlightBeforeCurrentDate extends FlightRemover implements FinderOrdinalNumberOfFlight  {

    @Override
    public ArrayList<Integer> find(List<Flight> flights) {
        ArrayList<Integer> arrayOfOrdinalNumber = new ArrayList<>();

        for (int i = 0; i < flights.size(); i++) {

            List<Segment> tempFlight = flights.get(i).getSegments();
            System.out.println(i);

            for (Segment segment : tempFlight) {
                int duration = (int) Duration.between(LocalDateTime.now(), segment.getDepartureDate()).toHours();
                if (duration < 0) arrayOfOrdinalNumber.add(i);
            }
        }
        return arrayOfOrdinalNumber;
    }
}
