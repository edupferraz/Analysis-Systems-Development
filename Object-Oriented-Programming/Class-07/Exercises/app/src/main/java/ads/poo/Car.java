package ads.poo;

public class Car {

    // Atributes
    private double speed;
    private String model;

    // Methods
    public void speedUp(double v) {
        speed += v;
    }

    public void speedDown(double v) {speed -= v;}

    public double getSpeed() {
        return speed;
    }


}