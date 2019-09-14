public class PasswordLowercase {
    public static void main(String[] args) {
        int min = 97;
        int max = 122;
        int length=6;

        System.out.println(password(max,min,length));
    }
    public static String password(int max, int min, int length){
        String Password="";


        for (int i = 0; i < length; i++) {
            int rand = (int)(Math.random() * (max - min + 1)) + min;

            char letter= (char) rand;


            Password=Password+letter;
        }



        return Password;
    }
}
