import java.util.Scanner;

class ArrayOutOfBoundary {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Please enter the row number of the element yo want.");
        int row = read.nextInt();
        System.out.println("Please enter the column number of the element yo want.");
        int column = read.nextInt();

        try {
            printElement(row, column);
        } catch (Exception e) {
            exception();
        }
    }
    public static void printElement(int r, int c) {
        int[][] array = {
                {1, 2, 3, 4, 5, 6},
                {2, 3, 8, 5, 3, 56, 78,},
                {4, 6, 7, 89, 90, 0, 8, 6, 5},
                {7, 9, 4, 2, 87, 9, 0, 0, 0}
        };
        System.out.println(array[r][c]);
    }
    public static void exception() {
        System.out.println("Your index is out of boundary.");
    }
}
