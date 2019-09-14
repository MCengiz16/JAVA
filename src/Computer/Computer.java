package Computer;

public class Computer {
    String[] boardSpecs;
    int memorySize;
    int CPUSpeed;
    String CPUType;


    public Computer(String[] boardSpecs, int memorySize, int CPUSpeed, String CPUType) {
        this.boardSpecs = boardSpecs;
        this.memorySize = memorySize;
        this.CPUSpeed = CPUSpeed;
        this.CPUType = CPUType;
    }

    public void turnOn(){
        System.out.println("Turn on computer");
    }

    public void turnOff(){
        System.out.println("Turn off computer");
    }
    public void boot(){
        System.out.println("boot");
    }
}
