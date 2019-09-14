import java.util.Arrays;
import java.util.Scanner;

class SplitArray {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter count");
        int count = read.nextInt();
        int[] array = getIntegers(count);
        System.out.println("Your array is " + Arrays.toString(array));
        splitArray(array);
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

    public static void splitArray(int[] array) {
        if (array.length % 2 == 0) {
            int[] array1 = new int[array.length / 2];
            int[] array2 = new int[array.length / 2];

            int length = array.length / 2;
            for (int i = 0; i < array.length / 2; i++) {
                array1[i] = array[i];
                array2[i] = array[length];
                length++;
            }


            System.out.println("Part 1 " + Arrays.toString(array1));
            System.out.println("Part 2 " + Arrays.toString(array2));
        } else {
            int[] array1 = new int[array.length / 2 + 1];
            int[] array2 = new int[array.length / 2 + 1];

            int half = array.length / 2;

            for (int i = 0; i < array.length / 2 + 1; i++) {
                array1[i] = array[i];
                half++;
            }
            int half2 = array.length / 2;
            for (int i = 0; i < array.length / 2 ; i++) {
                array2[i] = array[half2+1];
                half2++;
            }


            System.out.println("Part 1 " + Arrays.toString(array1));
            System.out.println("Part 2 " + Arrays.toString(array2));
        }


    }

}
