package com.gridnine.testing;

import java.util.List;

public class TestTask {
    public static void main(String[] args) {
        List<Flight> flights = FlightBuilder.createFlights();
        System.out.println("Input fights: ");
        printFlights(flights);
        flights = ChangerFlights.removeFlightBeforeCurrentDate(flights);
        flights = ChangerFlights.removeFlightWhereArriveBeforeDeparture(flights);
        flights = ChangerFlights.removeFlightWhereGroundTimeMoreThanTwoHours(flights);
        System.out.println("Output flights: \n");
        printFlights(flights);
    }



    public static void printFlights(List<Flight> flights) {
        for (int i = 0; i < flights.size(); i++) {
            System.out.println("\n\nFlight № " + (i + 1));

            List<Segment> tempFlight = flights.get(i).getSegments();

            for (int j = 0; j < tempFlight.size(); j++) {
                System.out.printf("segment %s \n",  (j + 1));
                System.out.println("Departure : " + tempFlight.get(j).getDepartureDate());
                System.out.println("Arrive    : " + tempFlight.get(j).getArrivalDate());
            }
        }
    }
}

