import java.util.Scanner;

public class SwitchGradebook {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("PLease enter your score (0-100) : ");
        int score = read.nextInt();
        System.out.println("Your grade is "+ calcGrade(score));


    }

    public static String calcGrade(int score){

        switch ((score >= 0 && score < 50) ? 0 : (score >= 50 && score < 60) ? 1 : (score >= 60 && score < 70) ? 2 :
                (score >= 70 && score < 80) ? 3 : (score >= 80 && score < 90) ? 4 : (score >= 90 && score <= 100) ? 5 : 6) {
            case 0:
                return "F";

            case 1:
                return "D";

            case 2:
                return "C";

            case 3:
                return "B";

            case 4:
                return "A";

            case 5:
                return "A+";

            default:
                return "invalid";
        }

    }
}