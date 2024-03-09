package ads.poo;

public class App {

    public static void main(String[] args) {

        Car c = new Car();

        System.out.println("Speed: " + c.getSpeed());

        c.speedUp(10);

        System.out.println("Speed: " + c.getSpeed());
    }
}
