public class PrintDiamond
{
    public static void main(String[] args)
    {
        int verticalSize = 10;
        int printSpace = 10;
        int printString = 1;



        for (int i = 1; i <= verticalSize; i++)
        {

            for (int j = 1; j < printSpace; j++)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= printString; k++)
            {

                System.out.print("X");

            }

            System.out.println();

            printSpace--;
            printString = printString + 2;
        }


        int verticalSize2 = verticalSize;
        int printSpace2 = 1;
        int printString2 = verticalSize2*2-2;



        for (int i = 1; i <= verticalSize2; i++)
        {

            for (int j = 1; j <= printSpace2; j++)
            {
                System.out.print(" ");
            }

            for (int k = 1; k < printString2; k++)
            {

                System.out.print("X");
            }


            System.out.println();

            printSpace2++;
            printString2 = printString2 -2;
        }





    }
}
