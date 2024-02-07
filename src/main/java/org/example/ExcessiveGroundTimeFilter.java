package org.example;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

public class ExcessiveGroundTimeFilter implements FlightFilter {
    @Override
    public List<Flight> filter(List<Flight> flights) {
        return flights.stream().filter(flight -> {
            List<Segment> segments = flight.getSegments();
            long totalGroundTime = 0;
            for (int i = 0; i < segments.size() - 1; i++) {
                Duration groundTime = Duration.between(segments.get(i).getArrivalDate(), segments.get(i + 1).getDepartureDate());
                totalGroundTime += groundTime.toMinutes();
            }
            return totalGroundTime <= 120; // 2 hours in minutes
        }).collect(Collectors.toList());
    }
}
