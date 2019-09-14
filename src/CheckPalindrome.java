import java.util.Scanner;

class CheckPalindrome {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("White your word.");
        String word = read.next();

        if (CheckPalindrome(word) == true) {
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("It is not a palindrome.");
        }

    }

    public static boolean CheckPalindrome(String word) {

        String reverse = "";
        for (int i = word.length() - 1; i >= 0; i--) {

            reverse = reverse + word.charAt(i);

        }
        if (word.equalsIgnoreCase(reverse)) {
            return true;

        } else {
            return false;
        }
    }
}
