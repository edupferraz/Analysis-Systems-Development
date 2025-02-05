package org.example;

public class ExplorerRobot {
    private String name;
    private Coordinate currentPosition;
    private double direction;
    private int battery;

    public ExplorerRobot(String name, Coordinate initialPosition, double initialDirection, int initialBattery) {
        this.name = name;
        this.currentPosition = initialPosition;
        this.direction = initialDirection;
        this.battery = initialBattery;
    }

    public void move() {
        System.out.println(name + " is moving.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Coordinate getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(Coordinate currentPosition) {
        this.currentPosition = currentPosition;
    }

    public double getDirection() {
        return direction;
    }

    public void setDirection(double direction) {
        this.direction = direction;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }
}