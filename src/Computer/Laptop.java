package Computer;

import java.util.Arrays;

public class Laptop extends Mobiles implements Computers {
    private String[] mainBoard;
    int memory;
    private String CPUType;
    int Battery;


    public Laptop(String[] mainBoard, int memory, String CPUType, int battery) {
        this.mainBoard = mainBoard;
        this.memory = memory;
        this.CPUType = CPUType;
        Battery = 10;
    }

    public String[] getMainBoard() {
        return mainBoard;
    }

    public void setMainBoard(String[] mainBoard) {
        this.mainBoard = mainBoard;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getCPUType() {
        return CPUType;
    }

    public void setCPUType(String CPUType) {
        this.CPUType = CPUType;
    }

    public int getBattery() {
        return Battery;
    }

    public void setBattery(int battery) {
        Battery = battery;
    }

    void changeBattery(int percentage){
        this.Battery=this.Battery+percentage;

    }

    void showBatteryPercentage(){
        System.out.println("Battery level is :"+this.Battery);
    }

    public void turnOffWifi(){
        System.out.println("turn Off Wifi");
    }
    public void turnOnWifi(){
        System.out.println("turn On Wifi");
    }
    public void setMainBoard(){
        System.out.println("Mainboard is set");
    }
    public void installCPU(){
if (CPUType.equals(mainBoard[0])){
    System.out.println("CPU installed");
}
else{
    System.out.println("incorrect CPU");
}
    }
    public void installMemory(){
        System.out.println("Memory installed");
    }

    @Override
    public String toString() {
        return "LAptop{" +
                "mainBoard=" + Arrays.toString(mainBoard) +
                ", memory=" + memory +
                ", CPUType='" + CPUType + '\'' +
                ", Battery=" + Battery +
                '}';
    }
}
