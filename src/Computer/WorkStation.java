package Computer;

public class WorkStation extends Computer implements Computers {
    String housingType;
    int screenSize;

    public WorkStation(String[] boardSpecs, int memorySize, int CPUSpeed, String CPUType, String housingType, int screenSize) {
        super(boardSpecs, memorySize, CPUSpeed, CPUType);
        this.housingType = housingType;
        this.screenSize = screenSize;
    }

    public void setMainBoard(){
        System.out.println("main board set");
    }
    public void installCPU(){
        System.out.println("CPU installed");
    }
    public void installMemory(){
        System.out.println("memory installed");
    }
}
