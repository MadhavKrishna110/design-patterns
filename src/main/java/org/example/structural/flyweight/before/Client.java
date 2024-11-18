package org.example.structural.flyweight.before;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Bullet> bulletList = new ArrayList<>();
        for(int i=0;i<200000;i++){
            Bullet bullet = new Bullet();
            bulletList.add(bullet);
        }
    }
}
