public class PrintStarsCrossInRect {
    public static void main(String[] args) {
        int a=4;

        for (int i = 0; i <= a; i++) {
            for (int j = 0; j <= a; j++) {
                if (i == 0 || j == 0 || i == a || j == a){System.out.print("x "); }

                else if ((i == 1 && j == 1) || (i == 2 && j == 2)||(i == 3 && j == 3) )
                { System.out.print("x "); }
                else if ((j == 3 && i == 1) || (j == 2 && i == 2)||(j == 1 && i == 3) )
                { System.out.print("x "); }

                else { System.out.print("  "); }

            }
            System.out.println();
        }

    }
}



