import java.util.Arrays;

public class ArrayMatchElements {
    public static void main(String[] args) {
        int[] array1 = {1,2,3};
        int[] array2 = {1,2};

        int[] array3 = createArray(array1, array2);
       int[] match = matchingElements(array1, array2, array3);

        System.out.println(Arrays.toString(match));



    }

    public static int[] matchingElements(int[] array1, int[] array2, int[] match) {
        int matchElement = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {

                            match[matchElement] = array1[i];
                            matchElement++;


                    }

                }

            }




        return match;
    }

    public static int[] createArray(int[] array1, int[] array2) {
        if (array1.length > array2.length) {
            int[] array3 = new int[array2.length];
            return array3;
        } else {
            int[] array3 = new int[array1.length];
            return array3;
        }

    }



}
