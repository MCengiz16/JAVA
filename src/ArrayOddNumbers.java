import java.util.Scanner;

public class ArrayOddNumbers {
    public static void main(String[] args) {

        int[] array = getIntegers(7);

        printArray(oddNumbers(array));
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

    public static void printArray(int[] numbers) {
        System.out.println("Odd Numbers Are: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0) {
                System.out.println("Element " + i + " value is " + numbers[i] + " and it is odd.");
            }


        }
    }

    public static int[] oddNumbers(int[] array) {
        int[] odd = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                odd[i] = array[i];
            }

        }
        return odd;
    }





}

