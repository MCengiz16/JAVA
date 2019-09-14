package Inheritance;

public class Bicycle {
   int gear;
   int speed;

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    Bicycle(){
        this.gear=5;
        this.speed=20;


    }
    Bicycle(int gear,int speed){
        this.gear=gear;
        this.speed=speed;


    }

    public void speedUp(int speedUp){
        this.speed=this.speed+speedUp;
    }
    public void slowDown(int speedDown){
        this.speed=this.speed-speedDown;
    }
    public void gearUp(int gearUp){
        this.gear=this.gear+gearUp;
    }
    public void gearDown(int gearDown){
        this.gear=this.gear-gearDown;
    }

}
