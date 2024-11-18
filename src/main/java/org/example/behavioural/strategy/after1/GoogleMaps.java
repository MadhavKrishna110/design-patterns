package org.example.behavioural.strategy.after1;

public class GoogleMaps {
    private PathCalculationStrategyFactory pathCalculationStrategyFactory;
    public void findPath(String from, String to, TransportMode mode){
        pathCalculationStrategyFactory.getPathCalculationStrategyForMode(mode).calculatePath(from,to);
    }
}
