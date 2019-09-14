import java.util.Scanner;

class ArraySum {
    public static void main(String[] args) {
        int[] array = getIntegers(7);
        int sum = sum(array);
        System.out.println("Sum of the array is " + sum);
    }

    public static int[] getIntegers(int capacity) {
        Scanner read = new Scanner(System.in);
        int[] myArray = new int[capacity];
        System.out.println("Enter " + capacity + " number.");
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = read.nextInt();
        }

        return myArray;

    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum;
    }
}
