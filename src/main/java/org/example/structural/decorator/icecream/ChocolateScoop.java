package org.example.structural.decorator.icecream;

public class ChocolateScoop implements IceCreamCone{
    private IceCreamCone iceCreamCone;

    public ChocolateScoop(IceCreamCone iceCreamCone){
        if(iceCreamCone==null){
            throw new NullPointerException();
        }
        this.iceCreamCone = iceCreamCone;
    }
    @Override
    public int getCost() {
        return iceCreamCone.getCost()+20;
    }

    @Override
    public String getConstituents() {
        return iceCreamCone.getConstituents()+" "+ "Chocolate";
    }
}
