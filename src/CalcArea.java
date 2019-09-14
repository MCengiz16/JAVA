import java.util.Scanner;
class CalcArea {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Enter C for circle, R for rectangle and T for triangle ");
        String shape = read.next();

        if ((shape.equals("c")) || (shape.equals("r"))|| (shape.equals("t")) )

        if (shape.equals("c")) {
            System.out.println("what is the radius?");
            float radius = read.nextFloat();
            System.out.printf("Area is %.2f",radius * 2 * 3.14);
        }

        else if (shape.equals("r")) {
            System.out.println("what is the Width?");
            float Width = read.nextFloat();
            System.out.println("what is the Height?");
            float Height = read.nextFloat();
            System.out.printf("Area is %.2f",2*(Height+Width));
        }

        else if (shape.equals("t")) {
            System.out.println("what is edge 1?");
            float edge1 = read.nextFloat();
            System.out.println("what is edge 2?");
            float edge2 = read.nextFloat();
            System.out.println("what is edge 3?");
            float edge3 = read.nextFloat();
            System.out.printf("Primeter is %.2f",edge1+edge2+edge3);
        }

        else { System.out.println("incorrect input.");}
    }
}
