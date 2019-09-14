import java.util.Scanner;
public class Receipt {
    public static void main(String[]args){
        Scanner read = new Scanner(System.in);

        System.out.println("Welcome. Please enter the name of your first item.");
        String item1Name = read.nextLine();
        System.out.println("Please enter the price for "+ item1Name+".");
        double item1Price = read.nextDouble();
        System.out.println("How many "+ item1Name+" you have?");
        int item1Count = read.nextInt();
        String a = read.nextLine();

        System.out.println("Please enter the name of your next item.");
        String item2Name = read.nextLine();
        System.out.println("Please enter the price for "+ item2Name+".");
        double item2Price = read.nextDouble();
        System.out.println("How many "+ item2Name+" you have?");
        int item2Count = read.nextInt();
        String b = read.nextLine();

        System.out.println("Please enter the name of your next item.");
        String item3Name = read.nextLine();
        System.out.println("Please enter the price for "+ item3Name+".");
        double item3Price = read.nextDouble();
        System.out.println("How many "+ item3Name+" you have?");
        int item3Count = read.nextInt();
        String c = read.nextLine();

        System.out.println("Please enter the name of your next item.");
        String item4Name = read.nextLine();
        System.out.println("Please enter the price for "+ item4Name+".");
        double item4Price = read.nextDouble();
        System.out.println("How many "+ item4Name+" you have?");
        int item4Count = read.nextInt();
        String d = read.nextLine();

        System.out.println("Please enter the name of your next item.");
        String item5Name = read.nextLine();
        System.out.println("Please enter the price for "+ item5Name+".");
        double item5Price = read.nextDouble();
        System.out.println("How many "+ item5Name+" you have?");
        int item5Count = read.nextInt();
        String e = read.nextLine();

        System.out.println("          Here is your receipt.");
        System.out.println(item1Name+"x"+item1Count+": $"+item1Price*item1Count);
        System.out.println(item2Name+"x"+item2Count+": $"+item2Price*item2Count);
        System.out.println(item3Name+"x"+item3Count+": $"+item3Price*item3Count);
        System.out.println(item4Name+"x"+item4Count+": $"+item4Price*item4Count);
        System.out.println(item5Name+"x"+item5Count+": $"+item5Price*item5Count);
        double total= (item1Price*item1Count)+(item2Price*item2Count)+ (item3Price*item3Count)
                       +(item4Price*item4Count)+(item5Price*item5Count);
        System.out.printf("Total: $ %.2f ",total);

        System.out.println("   ");



        System.out.println("          Thank you for shopping for us.");



    }
}
