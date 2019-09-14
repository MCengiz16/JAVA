public class BigToSmallConversion {
    public static void main(String[] args) {

        double theBiggest= 2147483647;
        float biger = (float) theBiggest;
        long big= (long) biger;
        int medium = (int) big;
        short smaller = (short) medium;
        byte theSmallest=(byte) smaller;

        System.out.println("Byte\t:"+theSmallest);
        System.out.println("short\t:"+smaller);
        System.out.println("int \t:"+medium);
        System.out.println("long\t:"+big);
        System.out.println("float\t:"+biger);
        System.out.println("double\t:"+theBiggest);
    }
}
