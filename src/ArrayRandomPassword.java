public class ArrayRandomPassword {
    public static void main(String[] args) {
        String[][] password = PasswordGenerator();
        print(password);
    }
    public static String[][] PasswordGenerator() {
        String[][] password = new String[4][];
        password[0] = new String[3];
        password[1] = new String[3];
        password[2] = new String[1];
        password[3] = new String[4];
        int rand = 0;
        char a;
        char b;
        char c;

        for (int i = 0; i < password.length; i++) {
            for (int j = 0; j < password[i].length; j++) {
                if (i == 0) {
                    rand = (int) (Math.random() * (90 - 65 + 1)) + 65;
                    a = (char) rand;
                    password[0][j] = Character.toString(a);
                }
                if (i == 1) {
                    rand = (int) (Math.random() * (122 - 97 + 1)) + 97;
                    b = (char) rand;
                    password[1][j] = Character.toString(b);
                }
                if (i == 2) {
                    rand = (int) (Math.random() * (47 - 33 + 1)) + 33;
                    c = (char) rand;
                    password[2][j] = Character.toString(c);
                }
                if (i == 3) {
                    rand = (int) (Math.random() * (100 + 1));

                    password[3][j] = Integer.toString(rand);
                }
                System.out.println();
            }
        }
        return password;
    }
    public static void print(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%3s ", array[i][j]);
            }
            System.out.println();
        }
    }
}
