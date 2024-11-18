package org.example.behavioural.strategy.after2;


import java.util.HashMap;
import java.util.Map;

public class PathCalculationStrategyRegistry {
    // We removed strategy factory because we will always get a new object which we don't want here
    // So we created a map with mode and strategy which will give us the strategy
    private Map<TransportMode,PathCalculationStrategy> strategies = new HashMap<>();
    public void register(TransportMode mode, PathCalculationStrategy strategy ){
    strategies.put(mode,strategy);
    }

    public PathCalculationStrategy get(TransportMode mode){
        return strategies.get(mode);
    }
}
