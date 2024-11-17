package org.example.prototype;

public class Sparrow extends Bird{

    Sparrow() {}
    Sparrow(Sparrow old){
        super(old);
    }
    @Override
    public Sparrow clone() {
        return new Sparrow(this);
    }
}
