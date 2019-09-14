package Computer;

public abstract class Mobiles {
    public abstract void turnOffWifi();
    public abstract void turnOnWifi();

    public void bluetoothConnected(){
        System.out.println("bluetooth Connected");
    }
}
