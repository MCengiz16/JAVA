import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        Integer[] numbers = {9, 7, 8, 4, 5, 1, 6, 2, 3};
        int temp;
        int i;
        int j;
        for (i = 0; i < numbers.length; i++) {
            for (j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    temp = numbers[j + 1];
                    numbers[j + 1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
