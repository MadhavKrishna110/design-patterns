package org.example.structural.flyweight.after;

import java.util.HashMap;
import java.util.Map;

public class BulletRegistry {
    private Map<BulletType,Bullet> bulletMap = new HashMap<>();

    public void registerBullet(BulletType bulletType,Bullet bullet){
        bulletMap.put(bulletType,bullet);
    }

    public Bullet getBullet(BulletType bulletType){
        return bulletMap.get(bulletType);
    }

}
