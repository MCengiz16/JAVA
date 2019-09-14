package StringMethods;

import java.util.Arrays;

public class StringMethodCall {
    public static void main(String[] args) {
        StringMethod myString= new StringMethod("elma tatli");
        System.out.println(myString.reversed() );
        System.out.println("---------------------------");

        System.out.println(myString.firstLetterUpperCase());
        System.out.println("---------------------------");

        System.out.println(Arrays.toString(myString.asArray()));
        System.out.println("---------------------------");

        System.out.println(Arrays.toString(myString.wordArray()));
    }
}
