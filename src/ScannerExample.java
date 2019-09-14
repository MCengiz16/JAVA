import java.util.Scanner;

public class ScannerExample {

    public static void main(String[]args){
     Scanner readFromKeyboad= new Scanner (System.in);

     System.out.println("What is your name?");
     String name= readFromKeyboad.nextLine();
     System.out.println("Your name is: " + name);



    }
}
