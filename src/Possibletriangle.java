public class Possibletriangle {
    public static void main(String[] args) {

        int a = 3;
        int b= 4;
        int c = 5;

        if(a+b>c & a+c> b && c+b> a ){
            System.out.println("This can be a triangle.");}
            else {
            System.out.println("This cannot be a triangle");}
    }
}
