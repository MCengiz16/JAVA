public class PrintABCD {
    public static void main(String[] args) {

        for (int i =1;i<5;i++){
            System.out.print(i+"   ");
            for (int j=97;j<101;j++){
                System.out.printf("%c ",j);
            }
            System.out.println();
        }
    }
}
