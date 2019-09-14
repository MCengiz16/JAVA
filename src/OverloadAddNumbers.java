public class OverloadAddNumbers {
    public static void main(String[] args) {
        addNumber();
        addNumber(4);
        addNumber(3,7);
        addNumber(6.0,8.0);


    }
    public static void addNumber(){
        int a =5;
        int b = 10;
        System.out.println(a+b);
    }
    public static void addNumber(int a){

        int b = 10;
        System.out.println(a+b);
    }

    public static void addNumber(int a,int b){

        System.out.println(a+b);
    }
    public static void addNumber(double a,double b){

        System.out.println(a+b);
    }
}
