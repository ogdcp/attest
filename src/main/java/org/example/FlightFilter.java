package org.example;
import java.util.List;

public interface FlightFilter {
    List<Flight> filter(List<Flight> flights);
}
