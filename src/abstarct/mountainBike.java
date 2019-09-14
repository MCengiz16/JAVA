package abstarct;

public class mountainBike extends bike {
    String tireName;
    int tireSize;

    public mountainBike(String tireName, int tireSize) {
        this.tireName = tireName;
        this.tireSize = tireSize;
    }
    void speedUp(){
        System.out.println("speed up");
    }
    void slowDown(){
        System.out.println("slow down");
    }
}
