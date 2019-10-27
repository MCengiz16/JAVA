package InterviewQuestions;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class FilterDuplicateArray {
    public static void main(String[] args) {
        Integer[] number = {1, 2, 3, 2, 3, 5, 7, 9, 4, 5, 6, 7};
        String[] words = {"apple", "orange", "apple", "orange"};

        System.out.println (Arrays.toString (filterDuplicate (number)));
        System.out.println (Arrays.toString (filterDuplicate (words)));


    }

    public static Integer[] filterDuplicate(Integer[] ar) {
        List<Integer> numberList = Arrays.asList(ar);
        LinkedHashSet<Integer> numberHashSet = new LinkedHashSet<>(numberList);
        Integer[] numberArray= numberHashSet.toArray (new Integer[0]);

        return numberArray;
    }


    public static String[] filterDuplicate(String[] ar) {
        List<String> stringList = Arrays.asList(ar);
        LinkedHashSet<String> stringHashSet = new LinkedHashSet<> (stringList);
        String[] numberArray= stringHashSet.toArray (new String[0]);

        return numberArray;
    }

}





