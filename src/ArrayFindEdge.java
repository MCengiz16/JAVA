public class ArrayFindEdge {
    public static void main(String[] args) {
        int[][] array = {
                {12, 55, 584, 55, 78},
                {34, 45, 67, 89, 56},
                {87, 90, 34, 123, 35},
                {12, 55, 78, 96, 48},
                {96, 154, 169, 84, 55},
        };
        edge(array);
    }
    public static void edge(int[][] array) {
        int edge = 0;
        int difference = 0;
        int j = 0;
        int i = 0;
        int tempJ=0;
        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array[i].length - 1; j++) {
                difference = Math.abs(array[i][j] - array[i][j + 1]);
                if (difference > edge) {
                    edge = difference;
                    tempJ=j;
                }
            }
            System.out.println("array[" + i + "][" + tempJ + "] is edge with the difference of " + edge);
            edge = 0;
            tempJ=0;
        }
    }
}
