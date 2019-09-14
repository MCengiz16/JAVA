public class ArrayCitiesPrint {
    public static void main(String[] args) {
        String[][] cities = {{"Adana", "Antalya", "Bursa", "Canakkale", "Denizli"}, {"Edirne", "Gumushane", "Hatay",},
                {"Isparta", "Istanbul", "Kastamonu", "Manisa"}, {"Nigde", "Rize", "Yozgat"}};
        printA(cities);
        printReverse(cities);
        printAH(cities);
    }
    public static void printA(String[][] array) {

        System.out.println("Cities Starting with A");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j].charAt(0) == 'A') {
                    System.out.println(array[i][j]);
                }
            }
        }
        System.out.println();
    }

    public static void printReverse(String[][] array) {
        System.out.println("Cities reversed");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = array[i][j].length() - 1; k >= 0; k--) {
                    System.out.print(array[i][j].charAt(k));
                }
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void printAH(String[][] array) {

        System.out.println("Cities Starting with A-H");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j].charAt(0) > 64 && array[i][j].charAt(0) < 73) {
                    System.out.println(array[i][j]);
                }
            }
        }
    }
}
