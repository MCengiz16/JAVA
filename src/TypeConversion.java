public class TypeConversion {
    public static void main(String[] args) {
     byte theSmallest=127;
     short smaller = theSmallest;
     int medium = smaller;
     long big= medium;
     float biger = big;
     double theBiggest= biger;
        System.out.println("Byte\t:"+theSmallest);
        System.out.println("short\t:"+smaller);
        System.out.println("int \t:"+medium);
        System.out.println("long\t:"+big);
        System.out.println("float\t:"+biger);
        System.out.println("double\t:"+theBiggest);
    }
}
