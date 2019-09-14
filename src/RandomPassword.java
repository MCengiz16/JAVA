public class RandomPassword {
    public static void main(String[] args) {
        int max = 10;
        int min = 1;
        int length=10;

        System.out.println(password(max,min,length));
    }
    public static String password(int max, int min, int length){
        int range = max - min + 1;
        String Password="";

        // generate random numbers within 1 to 10
        for (int i = 0; i < length; i++) {
            int rand = (int)(Math.random() * range) + min;

            String digit= Integer.toString(rand);


            Password=Password+digit;
        }



        return Password;
    }
}
