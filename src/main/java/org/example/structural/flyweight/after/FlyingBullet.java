package org.example.structural.flyweight.after;

public class FlyingBullet {

    private double xCoordinate;
    private double yCoordinate;
    private double zCoordinate;
    private double x_dir;

    public double getxCoordinate() {
        return xCoordinate;
    }

    public void setxCoordinate(double xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public double getyCoordinate() {
        return yCoordinate;
    }

    public void setyCoordinate(double yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public double getzCoordinate() {
        return zCoordinate;
    }

    public void setzCoordinate(double zCoordinate) {
        this.zCoordinate = zCoordinate;
    }

    public double getX_dir() {
        return x_dir;
    }

    public void setX_dir(double x_dir) {
        this.x_dir = x_dir;
    }

    public double getY_dir() {
        return y_dir;
    }

    public void setY_dir(double y_dir) {
        this.y_dir = y_dir;
    }

    public double getZ_dir() {
        return z_dir;
    }

    public void setZ_dir(double z_dir) {
        this.z_dir = z_dir;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public BulletStatus getBulletStatus() {
        return bulletStatus;
    }

    public void setBulletStatus(BulletStatus bulletStatus) {
        this.bulletStatus = bulletStatus;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public Bullet getBullet() {
        return bullet;
    }

    public void setBullet(Bullet bullet) {
        this.bullet = bullet;
    }

    private double y_dir;
    private double z_dir;
    private double speed;
    private BulletStatus bulletStatus;
    private long userId;
    private Bullet bullet;
}
