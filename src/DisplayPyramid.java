public class DisplayPyramid {

    public static void main(String[] args) {
        pyramid(10,"x");
        UpsideDownPyramid(10,"x");


    }

    public static void pyramid(int verticalSize,String shape) {

        int printSpace = 10;
        int printString = 1;


        for (int i = 1; i <= verticalSize; i++) {

            for (int j = 1; j < printSpace; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= printString; k++) {

                System.out.print(shape);

            }

            System.out.println();

            printSpace--;
            printString = printString + 2;
        }
    }


    public static void UpsideDownPyramid(int verticalSize2,String shape) {

        int printSpace2 = 1;
        int printString2 = 18;


        for (int i = 1; i <= verticalSize2; i++) {

            for (int j = 1; j <= printSpace2; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k < printString2; k++) {

                System.out.print(shape);
            }


            System.out.println();

            printSpace2++;
            printString2 = printString2 - 2;
        }


    }


}




