import java.util.Scanner;
public class PasswordCheck {
    public static void main(String[] args) {

        System.out.println(checkLength());




    }

    public static String checkLength(){
        Scanner read = new Scanner(System.in);
        System.out.println("Write your Password.");
        String password= read.nextLine();

        while (password.length()<6){
            System.out.println("Password must be at least 6 character long.");
            System.out.println("Write your Password.");
            password= read.nextLine();
        }

        return "Thank you. Your password is "+ '"'+password+'"';






    }

}
