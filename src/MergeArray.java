import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {
        int[] array1 = {1,2,3};
        int[] array2 = {1,2};
        int[] merge = new int[array1.length+array2.length];
        int index=0;

        for (int i = 0; i < array1.length; i++){

            merge[index]=array1[i];

            index++;
        }
        for (int i = 0; i < array2.length; i++){

            merge[index]=array2[i];

            index++;
        }

        System.out.println(Arrays.toString(merge));
    }
}
