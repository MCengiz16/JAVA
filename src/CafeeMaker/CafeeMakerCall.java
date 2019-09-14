package CafeeMaker;

public class CafeeMakerCall {
    public static void main(String[] args) {
        CafeMaker myCafeMaker=new CafeMaker();
       myCafeMaker.setTimer(50);
        System.out.println(myCafeMaker.getTimer());
        myCafeMaker.reset();
        System.out.println(myCafeMaker.getTimer());
    }
}
