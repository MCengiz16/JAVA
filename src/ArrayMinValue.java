import java.util.Scanner;

class ArrayMinValue {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter count");
        int count=read.nextInt();
        int[] array = readIntegers(count);
        int min = findMin(array);
        System.out.println("Minimum element is " + min);
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

    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {

            if (min > array[i]) {
                min = array[i];
            }
        }


        return min;
    }
}
