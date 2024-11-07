package SampleApp;

public class Venue {
    public static void main(String[] args) {
        Car1 venue = new Car1();
        venue.setColor("black");
        venue.setSize(60);
        venue.setWeight(65.10);
        venue.displayCar();
        Car1.accelerate();
        Car1.start();

        displayLogo("A");
        displayLogo(100);
    }

    public static void displayLogo(String s1) {
        System.out.println("Press Break" + s1);
    }

    public static void displayLogo(int s) {
        System.out.println("Press Break1" + s);
    }
}
