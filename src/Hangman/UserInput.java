package Hangman;

import java.util.Scanner;

public class UserInput {
    static char userInput() {
        Scanner read = new Scanner(System.in);
        System.out.println("Guess a letter :");
        String input = read.next();

        while (input.length() > 1) {
            System.out.println("Please enter  1 letter");
            read.nextLine();
            input = read.next();

        }

        char guess = input.charAt(0);
        guess = Character.toLowerCase(guess);

        return guess;

    }
}
