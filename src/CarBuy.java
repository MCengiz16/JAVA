import java.util.Scanner;

public class CarBuy {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Which car you want? X or Y");
        String car = read.next();

        if (car.equalsIgnoreCase("x")) {
            System.out.println("Do you want to buy Body Package?(Y/N)");
            String body = read.next();
            if (body.equalsIgnoreCase("y")) {
                System.out.println("Do you want to buy Sound Package?(Y/N)");
                String sound = read.next();
                if (sound.equalsIgnoreCase("y")) {
                    System.out.println("Your Bill is $38.000");
                } else
                    System.out.println("Your Bill is $35.000");
            }
            if (body.equalsIgnoreCase("n")) {
                System.out.println("Do you want to buy Sound Package?(Y/N)");
                String sound = read.next();
                if (sound.equalsIgnoreCase("y")) {
                    System.out.println("Your Bill is $33.000");
                } else
                    System.out.println("Your Bill is $30.000");
            }
        } else if (car.equalsIgnoreCase("y")) {
            System.out.println("Do you want to buy Entertainment Package?(Y/N)");
            String entertainment = read.next();
            if (entertainment.equalsIgnoreCase("y")) {
                System.out.println("Do you want to buy safety Package?(Y/N)");
                String safety = read.next();
                if (safety.equalsIgnoreCase("y")) {
                    System.out.println("Your Bill is $47.000");
                } else
                    System.out.println("Your Bill is $43.000");
            }
            if (entertainment.equalsIgnoreCase("n")) {
                System.out.println("Do you want to buy safety Package?(Y/N)");
                String safety = read.next();
                if (safety.equalsIgnoreCase("y")) {
                    System.out.println("Your Bill is $39.000");
                } else
                    System.out.println("Your Bill is $35.000");
            }
        } else
            System.out.println("invalid");
    }
}
