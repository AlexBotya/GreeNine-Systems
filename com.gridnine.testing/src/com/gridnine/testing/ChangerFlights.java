package com.gridnine.testing;
import java.util.List;

public class ChangerFlights {
    public static List<Flight> removeFlightBeforeCurrentDate(List<Flight> flights) {
        flights = FlightRemover.removeFlightByOrdinalNumber(flights, new FinderFlightBeforeCurrentDate().find(flights));
        return flights;
    }


    public static List<Flight> removeFlightWhereArriveBeforeDeparture(List<Flight> flights) {
        flights = FlightRemover.removeFlightByOrdinalNumber(flights, new FinderFlightWhereArriveBeforeDeparture().find(flights));
        return flights;
    }


    public static List<Flight> removeFlightWhereGroundTimeMoreThanTwoHours(List<Flight> flights) {
        flights = FlightRemover.removeFlightByOrdinalNumber(flights, new FinderFlightWhereGroundTimeMoreThanTwoHours().find(flights));
        return flights;
    }
}
