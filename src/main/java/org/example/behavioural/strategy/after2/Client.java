package org.example.behavioural.strategy.after2;

public class Client {
    public static void main(String[] args) {
        PathCalculationStrategyRegistry pathCalculationStrategyRegistry = new PathCalculationStrategyRegistry();
        pathCalculationStrategyRegistry.register(TransportMode.CAR,new CarPathCalculationStrategy());
        pathCalculationStrategyRegistry.register(TransportMode.BIKE,new BikePathCalculationStrategy());
        pathCalculationStrategyRegistry.register(TransportMode.WALK,new WalkPathCalculationStrategy());

        GoogleMaps googleMaps = new GoogleMaps(pathCalculationStrategyRegistry);
        googleMaps.findPath("123","321",TransportMode.WALK);
    }
}
