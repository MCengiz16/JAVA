package ThisSuper;

public class Call {
    public static void main(String[] args) {
        Parent myParent=new Parent();
        Child myChild=new Child();

        myParent.printParent();
        System.out.println("===========================");

        myChild.printParent();
        System.out.println("===========================");

        myChild.printChild();
        System.out.println("===========================");

        myParent.printParent();
        System.out.println("===========================");
    }
}
