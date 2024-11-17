package org.example.prototype;

public class Crow extends Bird {
    private String sound = "Kaw";
    Crow() {}
    public Crow(Crow old) {
        super(old);
        this.sound = old.sound;
    }
    @Override
    public Crow clone() {
        // Parent attributes aren't copied
//        Crow copy = new Crow();
//        copy.sound = this.sound;
        return new Crow(this);
    }
}
