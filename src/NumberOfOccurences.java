import java.util.HashMap;

public class NumberOfOccurences {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 3, 2, 2,};
        int count = 0;
        HashMap<Integer,Integer> occurs= new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count = count + 1;
                }

            }
            occurs.put(array[i] ,count);
            count = 0;
        }

        System.out.println(occurs);

    }

}
