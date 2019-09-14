import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {
    Scanner read=new Scanner(System.in);

        System.out.println("What is the temperature?");
        int temp=read.nextInt();
        if (temp <20){
            System.out.println("Winter time");}
        else if (20< temp&& temp <41){
            System.out.println("Fall time");}
        else if (40< temp&& temp <61){
            System.out.println("Spring time");}
        else {
            System.out.println("Summer time");}

    }
}
