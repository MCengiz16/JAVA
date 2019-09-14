public class PrintPineTree {
    public static void main(String[] args) {
        int verticalSize = 10;
        int printString = 1;
        int printSpace = 10;


        for (int i = 1; i <= verticalSize; i++) {

            for (int j = 1; j < printSpace; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= printString; k++) {

                System.out.print("X");

            }

            System.out.println();

            printSpace--;
            printString = printString + 2;
        }

        for(int i=1;i<10;i++){
            System.out.println("         X");
        }

    }
}
