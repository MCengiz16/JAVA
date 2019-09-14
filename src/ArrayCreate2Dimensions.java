import java.util.Arrays;

public class ArrayCreate2Dimensions {
    public static void main(String[] args) {
        int[][] array = createArray();
        System.out.println(Arrays.deepToString(array));
        printArray(array);



    }

    public static int[][] createArray() {
        int[][] numbers = new int[10][10];
        int number = 1;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                numbers[i][j] = number;
                number++;

            }

        }
        return numbers;
    }

    public static void printArray(int[][] array) {


        int rowsumtotal=0;
        for (int i = 0; i < array.length; i++) {
            int rowSum=0;

            for (int j = 0; j < array.length; j++) {
                System.out.printf("%6d", array[i][j]);
                rowSum=rowSum+array[i][j];
                rowsumtotal=rowsumtotal+rowSum;

            }
            System.out.print("  : "+ rowSum);
            System.out.println();
        }
        System.out.println("======================================================================================");


        for (int i = 0; i < array.length; i++) {
            int colSum=0;

            for (int j = 0; j < array.length; j++) {


                colSum =colSum+ array[j][i];
            }

            System.out.printf("%5d ", colSum);


        }

        System.out.print("   : "+ rowsumtotal);
    }
}












