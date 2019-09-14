public class DivisionByZero {
    public static void main(String[] args) {
        division(9,3);
    }

    public static void division(int a,int b) {

        try{
            int result=a/b;
            System.out.println(result);
        }
        catch (Exception e){
            System.out.println("You cannot divide by zero.");
        }
        System.out.println("end");
    }
}
