import java.util.Scanner;
public class ForScan {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Please enter the first number?");
        int first = read.nextInt();
        System.out.println("Please enter the Second number?");
        int second = read.nextInt();

        if (first >= second) {
            System.out.println("First number should be smaller than second.");
        } else
            //for (int i = first; i < second; i = i + 5) { System.out.println(i); }

            for (int i = first; i < second; i++) {
                if (i % 5 == 0) { System.out.println(i); }
            }

    }
}


