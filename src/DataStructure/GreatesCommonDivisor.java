package DataStructure;

public class GreatesCommonDivisor {
    public static void main(String[] args) {
        int  number1=96;
        int number2 = 128;
        int temp;

        if(number2>number1)
        {
            temp=number1;
            number1=number2;
            number2=temp;
        }

        System.out.println(number1);

        for(int i=number2;i>1;i--)
        {
            if(number1%i==0 && number2%i==0) {
                System.out.println("GCD is "+i);
                break;
            }
            else if (i==2)
                {
                    System.out.println("there is no GCD");
                }
        }

    }
}
