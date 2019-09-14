public class ForStatements {
    public static void main(String[] args) {

       for (int i=101;1000>i;i++){
            System.out.println(i);}

        for (int i=0;255>=i;i++){
            System.out.println((char)i);}

        for (int i=65;90>=i;i++){
           System.out.printf("%d = %c ",i,i);}

        for (int i=97;122>=i;i++){
            System.out.printf("%d = %c \n ",i,i);}

        for (int i=1;i<100;i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
