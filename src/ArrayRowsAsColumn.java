public class ArrayRowsAsColumn {
    public static void main(String[] args) {

        try {
            int[][] array = {
                    {1, 2, 3},
                    {4, 5, 6,8},
                    {7, 8, 9}
            };
            int[][] flipped = flip(array);
            print(flipped);
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Hello World");
        }
    }
    public static int[][] flip(int[][] array) {
        int[][] flipped = new int[array[0].length][array.length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                flipped[j][i] = array[i][j];
            }
        }
        return flipped;
    }
    public static void print(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
