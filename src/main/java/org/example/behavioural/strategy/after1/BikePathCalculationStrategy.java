package org.example.behavioural.strategy.after1;

public class BikePathCalculationStrategy implements PathCalculationStrategy{
    @Override
    public void calculatePath(String from, String to) {
        System.out.println("Finding path for Bike");
    }
}
