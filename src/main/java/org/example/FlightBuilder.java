package org.example;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class FlightBuilder {
    public static List<Flight> createFlights() {
        LocalDateTime threeDaysFromNow = LocalDateTime.now().plusDays(3);
        return Arrays.asList(
                new Flight(Arrays.asList(new Segment(threeDaysFromNow, threeDaysFromNow.plusHours(2)))),
                new Flight(Arrays.asList(
                        new Segment(threeDaysFromNow, threeDaysFromNow.plusHours(2)),
                        new Segment(threeDaysFromNow.plusHours(3), threeDaysFromNow.plusHours(5))
                )),
                new Flight(Arrays.asList(new Segment(threeDaysFromNow.minusDays(6), threeDaysFromNow))),
                new Flight(Arrays.asList(new Segment(threeDaysFromNow, threeDaysFromNow.minusHours(6)))),
                new Flight(Arrays.asList(
                        new Segment(threeDaysFromNow, threeDaysFromNow.plusHours(2)),
                        new Segment(threeDaysFromNow.plusHours(5), threeDaysFromNow.plusHours(6))
                )),
                new Flight(Arrays.asList(
                        new Segment(threeDaysFromNow, threeDaysFromNow.plusHours(2)),
                        new Segment(threeDaysFromNow.plusHours(3), threeDaysFromNow.plusHours(4)),
                        new Segment(threeDaysFromNow.plusHours(6), threeDaysFromNow.plusHours(7))
                ))
        );
    }
}
