package Shapes;

public class Shapes {
    char symbol;
    int height;

    public Shapes(char symbol, int height) {
        this.symbol = symbol;
        this.height = height;
    }
    public Shapes() {
        this.symbol = '*';
        this.height = 10;
    }
    public void printRectangle(){
        int printString = 1;
        int printSpace = this.height;


        for (int i = 1; i <= this.height; i++) {

            for (int j = 1; j < printSpace; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= printString; k++) {

                System.out.print(this.symbol);

            }

            System.out.println();

            printSpace--;
            printString = printString + 2;
        }

    }
   public void printPyramid(){
       int printString = 1;
       int printSpace = this.height;


       for (int i = 1; i <= this.height; i++) {

           for (int j = 1; j < printSpace; j++) {
               System.out.print(" ");
           }
           for (int k = 1; k <= printString; k++) {

               System.out.print(this.symbol);

           }

           System.out.println();

           printSpace--;
           printString = printString + 2;
       }
       int verticalSize2 = this.height;
       int printSpace2 = 1;
       int printString2 = verticalSize2*2-2;



       for (int i = 1; i <= verticalSize2; i++) {

           for (int j = 1; j <= printSpace2; j++) {
               System.out.print(" ");
           }

           for (int k = 1; k < printString2; k++) {

               System.out.print(this.symbol);
           }


           System.out.println();

           printSpace2++;
           printString2 = printString2 -2;
       }







   }


}
