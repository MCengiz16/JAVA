public class ArraySymmetric {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 3, 2, 1};
        boolean symmetric = symmetric(array);
        System.out.println("Is your array symmetric? : " + symmetric);
    }

    public static boolean symmetric(int[] array) {
        boolean answer = true;
        int length = array.length - 1;

        for (int i = 0; i < length; i++) {

            if (array[i] != array[length]) {
                answer = false;
                break;
            }
            length--;
        }
        return answer;
    }
}
