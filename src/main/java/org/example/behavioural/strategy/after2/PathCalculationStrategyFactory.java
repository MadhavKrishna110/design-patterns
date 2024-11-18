package org.example.behavioural.strategy.after2;

public class PathCalculationStrategyFactory {
    PathCalculationStrategy getPathCalculationStrategyForMode(TransportMode mode){
        if(mode== TransportMode.BIKE){
            return new BikePathCalculationStrategy();
        } else if(mode== TransportMode.CAR){
            return new CarPathCalculationStrategy();
        } else if(mode== TransportMode.WALK){
            return new WalkPathCalculationStrategy();
        }
        return null;
    }
}
