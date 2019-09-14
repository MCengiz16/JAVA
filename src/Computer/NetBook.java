package Computer;

public class NetBook extends Laptop {
    double weight;

    public NetBook(String[] mainBoard, int memory, String CPUType, int battery, double weight) {
        super(mainBoard, memory, CPUType, battery);
        this.weight = weight;
    }
}
