package org.example.behavioural.strategy.before;

public class GoogleMaps {
    public void findPath(String from,String to,TransportMode mode){
        if(mode==TransportMode.CAR){
            System.out.println("Finding path for Car");
        } else if(mode == TransportMode.WALK){
            System.out.println("Finding path for Walk");
        } else if(mode == TransportMode.BIKE){
            System.out.println("Finding path for Bike");
        }
    }
}
