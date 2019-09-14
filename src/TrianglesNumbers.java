public class TrianglesNumbers {
    public static void main(String[] args) {


        for (int i = 1; i < 8; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k < 8; k++) {
                System.out.print(k + " ");
            }
            System.out.println();

        }

        for (int i = 1; i < 7; i++) {
            for (int j = 6; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 7 - i; k < 8; k++) {
                System.out.print((k) + " ");
            }
            System.out.println();

        }
    }
}
