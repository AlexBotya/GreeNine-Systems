package com.gridnine.testing;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TestTask {
    public static void main(String[] args) {
        List<Flight> flights = FlightBuilder.createFlights();
        for (int i = 0; i < flights.size(); i++) {
            System.out.println(flights);
            System.out.println();

        }
        //FlightBuilder flights = new FlightBuilder();


    }
}

