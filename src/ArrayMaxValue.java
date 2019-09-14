import java.util.Scanner;

public class ArrayMaxValue {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter count");
        int count = read.nextInt();
        int[] array = readIntegers(count);
        int max = findMax(array);
        System.out.println("Biggest element is " + max);
    }

    public static int[] readIntegers(int count) {
        int[] array = new int[count];
        Scanner read = new Scanner(System.in);
        System.out.println("Enter " + count + " integer values.");
        for (int i = 0; i < count; i++) {
            array[i] = read.nextInt();
        }
        return array;
    }

    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {

            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }
}


