import java.util.Scanner;

class RemoveConsecutive {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        while (true) {
            System.out.println("Write your word.");
            String word = read.next();
            System.out.println(removeConsecutive(word));
        }
    }


    public static String removeConsecutive(String word) {

        String result = ""+word.charAt(0);

        for (int i = 1; i < word.length(); i++) {

            if (word.charAt(i-1) != word.charAt(i)) {

                result = result + word.charAt(i);

            }
        }

        return result;
    }
}
