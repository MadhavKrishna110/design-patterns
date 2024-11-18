package org.example.structural.decorator.icecream;

public class Customer {
    public static void main(String[] args) {
        IceCreamCone iceCreamCone = new VanillaScoop(new ChocolateScoop(new VanillaScoop(new OrangeCone())));
        System.out.println(iceCreamCone.getConstituents());
        System.out.println(iceCreamCone.getCost());
    }
}
