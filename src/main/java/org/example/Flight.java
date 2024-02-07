package org.example;

import java.util.ArrayList;
import java.util.List;

public class Flight {
    private List<Segment> segments = new ArrayList<>();

    public Flight(List<Segment> segments) {
        if (segments != null) {
            this.segments.addAll(segments);
        }
    }

    public List<Segment> getSegments() {
        return new ArrayList<>(segments);
    }

    @Override
    public String toString() {
        return "Flight{segments=" + segments + '}';
    }
}
