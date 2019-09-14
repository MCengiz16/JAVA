package Inheritance;

public class BicycleCall {
    public static void main(String[] args) {
        Bicycle myBicycle=new Bicycle();
        System.out.println(myBicycle.getSpeed());
        System.out.println(myBicycle.getGear());
        System.out.println("====================================");
        myBicycle.setGear(7);
        myBicycle.setSpeed(40);
        System.out.println(myBicycle.getSpeed());
        System.out.println(myBicycle.getGear());
        System.out.println("====================================");
        myBicycle.gearUp(3);
        myBicycle.speedUp(10);
        System.out.println(myBicycle.getSpeed());
        System.out.println(myBicycle.getGear());
        System.out.println("====================================");
        myBicycle.gearDown(4);
        myBicycle.slowDown(30);
        System.out.println(myBicycle.getSpeed());
        System.out.println(myBicycle.getGear());
        System.out.println("====================================");



    }
}
