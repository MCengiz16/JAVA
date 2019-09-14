public class MethodOverload {
    public static void main(String[] args) {
        print();
        print(5);
        print(5,"Java");

    }

    public static void print() {
        int number=1;
        String word= "Hello!";

        for (int i=0;i<number;i++){
            System.out.println(word);
        }
        System.out.println("End of method.");
        System.out.println();

    }
    public static void print(int number) {
        String word = "Hello!";

        for (int i = 0; i < number; i++) {
            System.out.println(word);
        }
        System.out.println("End of method.");
        System.out.println();
    }
    public static void print(int number,String word) {

        for (int i = 0; i < number; i++) {
            System.out.println(word);
        }
        System.out.println("End of method.");
        System.out.println();
    }
}
