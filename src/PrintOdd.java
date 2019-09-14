package OddNumbers;

public class PrintOdd {
    public static void  printOdd(int a, int b){
        int temp= 0;
        if(a>b){temp=b;b=a;a= temp;}

            while (a<b){if (a%2!=0){
                System.out.println(a);}
                a++;
            }



    }
}
