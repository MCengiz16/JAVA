package Computer;

public class Main {
    public static void main(String[] args) {
        String[] specs={"intel","200","64"};

Laptop myLaptop=new Laptop(specs,16, "intel",50 );
WorkStation myWorkstation=new WorkStation(specs,32, 4000,"amd", "tower", 34);
NetBook myNetBook =new NetBook(specs,16, "intel",50 ,2);

        System.out.println(myNetBook.toString());

    }
}
