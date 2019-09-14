public class PasswordWithNumbersLettersAndSpecialChars {
    public static void main(String[] args) {
        int min = 33;
        int max = 122;
        int length = 15;
        System.out.println(password(max, min, length));
    }

    public static String password(int max, int min, int length) {
        String Password = "";
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * (max - min + 1)) + min;
            if (Math.random() > 0.5) {
                char digit = (char) rand;
                Password = Password + digit;
            } else {
                String digit = Integer.toString(rand);
                Password = Password + digit;
            }
        }
        return Password;
    }
}
