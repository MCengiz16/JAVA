import java.util.Scanner;

public class ArrayStringLength {
    public static void main(String[] args) {
        String[] array = getString(5);
        checkLength(array);
    }

    public static String[] getString(int capacity) {
        Scanner read = new Scanner(System.in);
        String[] myArray = new String[capacity];
        System.out.println("Enter " + capacity + " strings");
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = read.next();
        }

        return myArray;

    }

    public static void checkLength(String[] array) {
        int total = 0;

        for (int i = 0; i < array.length; i++) {
            String test = array[i];
            if (test.length() < 4) {
                total++;

            }


        }
        System.out.println("There are " + total + " elements its length is less than 4.");
    }
}
