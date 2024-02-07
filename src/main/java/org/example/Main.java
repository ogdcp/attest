package org.example;

import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<Flight> flights = FlightBuilder.createFlights();

        System.out.println("Original flights:");
        flights.forEach(System.out::println);

        FlightFilter beforeNowFilter = new DepartureBeforeNowFilter();
        System.out.println("\nFiltered: Flights departing after now");
        beforeNowFilter.filter(flights).forEach(System.out::println);

        FlightFilter arriveBeforeDepartFilter = new ArriveBeforeDepartFilter();
        System.out.println("\nFiltered: Flights with logical segment times");
        arriveBeforeDepartFilter.filter(flights).forEach(System.out::println);

        FlightFilter excessiveGroundTimeFilter = new ExcessiveGroundTimeFilter();
        System.out.println("\nFiltered: Flights with acceptable ground time");
        excessiveGroundTimeFilter.filter(flights).forEach(System.out::println);
    }
}