public class PrintTriangles2 {
    public static void main(String[] args) {
        int verticalSize = 10;
        int printSpace = 10;
        int printString = 1;


        while (1 <= verticalSize) {
            int count = 1;
            while (count < printSpace) {
                System.out.print(" ");
                count++;
            }
            int count2 = 1;
            while (count2 <= printString) {
                System.out.print("X");
                count2++;
            }

            printSpace--;
            verticalSize--;
            printString = printString + 2;


            System.out.println();
        }
    }
}


