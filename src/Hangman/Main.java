package Hangman;

public class Main {
    public static void main(String[] args) {
        String word = RandomWord.RandomWord();
        String[] print = new String[word.length()];
        for (int i = 0; i < word.length(); i++) {
            print[i] = "_";
        }
        System.out.println("Your word is " + word.length() + " character long");

        for (int i = 0; i < word.length(); i++) {
            System.out.print("_ ");
        }
        System.out.println();

        int printMan = 0;
        int countTry = 0;


        while (printMan < 3) {
            PrintMan.printMan(countTry);
            printMan = PrintWord.printWord(word, print);
            if (printMan == 1) {
                countTry++;
            }
            if (printMan == 3) {
                System.out.println("Congratulations! You win.");
                break;
            }
            if (countTry == 9) {
                System.out.println("Game Over! The word was '" + word+"'");

                PrintMan.printMan(countTry);
                break;
            }


        }


    }
}
