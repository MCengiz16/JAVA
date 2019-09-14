public class Exceptions {
    public static void main(String[] args) {
        System.out.println("start");
        int[] a= new int[4];
        try{
            int b = 5/0;
            a[6]= 0;


            System.out.println(b);
            System.out.println(a[6]);
        }
        catch (ArithmeticException e){
           // System.out.println(e);
            //e.getCause();
            //e.getMessage();
            e.printStackTrace();


        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);

        }

        System.out.println("Still Here");


    }
}
