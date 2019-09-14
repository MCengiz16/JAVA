import java.util.Scanner;

public class CheckGender {
    public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
        System.out.println("enter F or M");
        String gender = read.next();


        if (gender.equals("m")) {
            System.out.println("Male");
        }

        if (gender.equals("f")) {
            System.out.println("female");
        }

    }
}
