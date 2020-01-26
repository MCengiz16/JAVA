public class Sample {
    String type;
    String color;
    String greeting;
    Sample( String color, String type ) {
        System.out.println("The car is a " + color + " " + type);
    }
    void driveCar() {

        System.out.println(greeting + " Would you like to drive my "
                + color + " " + type + "?");
    }
}