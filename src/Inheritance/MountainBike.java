package Inheritance;

public class MountainBike extends  Bicycle {

    int tireSize;
    boolean suspension;

public MountainBike(int gear,int speed,int tireSize,boolean suspension){
    super(gear,speed);
    this.tireSize=17;
    this.suspension=true;
}

    public MountainBike() {

    }


    public String toString(){
    return (super.toString());
}
}
