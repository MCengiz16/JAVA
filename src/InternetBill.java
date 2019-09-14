import java.util.Scanner;
public class InternetBill {
    public static void main(String[] args) {
   Scanner read = new Scanner(System.in);

        System.out.println("Are you subscribed? Y/N");
        String answer = read.next();

        if (answer.equals("Y") ) {
            System.out.println("what is your usage?");
            int answer2= read.nextInt();
            if (answer2 >=0&& answer2<=100){
                System.out.println("your bill is $20");
            }
            if (answer2 >100){
                System.out.println("Your bill is $40");
            } }
            else
                System.out.println("Please subscribe.");




    }
}
