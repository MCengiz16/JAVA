package Hangman;

public class PrintWord {
    static int printWord(String word, String[] print) {
        char guess = UserInput.userInput();
        boolean exist = false;


        for (int i = 0; i < word.length(); i++) {
            if (print[i].charAt(0) == '_' & word.charAt(i) == guess) {
                print[i] = Character.toString(word.charAt(i));
                exist = true;
            } else if (print[i].charAt(0) == guess) {
                for (int j = 0; j < word.length(); j++) {
                    System.out.print(print[j] + " ");
                }
                System.out.println("You already used this letter");
                return 1;
            } else {


            }

        }

        for (int i = 0; i < word.length(); i++) {
            System.out.print(print[i] + " ");
        }

        if (exist == false) {
            System.out.println("There are no '" + guess + "' in this word. Please Try again");
//no match
            return 1;
        }
        boolean done = true;
        if (exist) {
            for (int i = 0; i < word.length(); i++) {
                if (print[i].charAt(0) == '_') {
                    done = false;
                }
            }
        }
        if (done) {
            //user win
            System.out.println();
            return 3;
        }
        System.out.println();
//match and continue
        return 2;

    }
}
