package CafeeMaker;

public class CafeMaker {
    int cups;
    int timer;

    CafeMaker(){
        this.cups=2;
        this.timer=40;
    }
    CafeMaker(int cups, int timer){
        this.cups= cups;
        this.timer=timer;
    }

    public void setTimer(int timer) {
        this.timer = timer;
    }

    public int getTimer() {
        return timer;
    }
    public void reset() {
        this.timer = 0;
    }

}
