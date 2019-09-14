package Shapes;

public class ShapesCall {
    public static void main(String[] args) {
        Shapes myShape=new Shapes();
        myShape.printRectangle();
        System.out.println("---------------");
        myShape.printPyramid();
        System.out.println("---------------");

        Shapes myShape2=new Shapes('@',20);

        myShape2.printRectangle();
        System.out.println("---------------");
        myShape2.printPyramid();

    }
}
