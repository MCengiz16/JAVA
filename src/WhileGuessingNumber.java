import java.util.Scanner;
public class WhileGuessingNumber {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int a =35;


        while(true){
            System.out.println("Guess a number?");
            int b = read.nextInt();
            if (b>a){
                System.out.println("Smaller than that");
            }
            else if (b<a){
                System.out.println("Larger than that");
            }
            else if (b==a){
                System.out.println("congratulation!");
                break;
            }
        }

    }
}
