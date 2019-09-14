import java.util.Scanner;

public class CalcRect {


    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);


        System.out.println("What is the long side? ");
        int longSide = read.nextInt();

        System.out.println("What is the short side?");
        int shortSide = read.nextInt();

        int area = shortSide*longSide;

        System.out.println("The are of the rectangle is = "+ area);
    }
}
