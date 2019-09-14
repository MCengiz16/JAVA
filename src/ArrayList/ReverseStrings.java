package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseStrings {
    public static void main(String[] args) {


        ArrayList<String> myList = new ArrayList<String>(
                Arrays.asList("one", "two", "three", "four", "five"));
        System.out.println(myList);

        ArrayList<String> reversed = new ArrayList<String>();
        String element = "";
        String reversedElement = "";
        int counter=0;

        for (int i = myList.size() - 1; i >= 0; i--) {
            element = myList.get(i);
            for (int j = element.length() - 1; j >= 0; j--) {
                reversedElement = reversedElement + element.charAt(j);
            }
            myList.set(counter,reversedElement);

            reversed.add(reversedElement);
            reversedElement = "";

        }
        System.out.println(reversed);

    }
}
