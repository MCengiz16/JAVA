package GenericClasses;

public class Main {
    public static void main(String[] args) {
        Demo<Integer> myDemo=new Demo<>(4,8);

        System.out.println(myDemo.getFirst());
        System.out.println(myDemo.getSecond());

        myDemo.setFirst(40);
        myDemo.setSecond(100);

        System.out.println(myDemo.getFirst());
        System.out.println(myDemo.getSecond());

    }
}
