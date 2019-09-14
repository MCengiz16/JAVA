import java.util.Scanner;

public class AgeFromBirth {


    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);


        System.out.println("What is your name?");
        String name = read.next();

        System.out.println("What is your date of birth?");
        int DOB = read.nextInt();

        int age = 2019 - DOB;

        System.out.println(name + " is " + age + " years old.");
    }
}
