package Hangman;


public class RandomWord {

    static String RandomWord() {
        String[] words = {"apple", "book", "computer","pencil","phone","chair","dog","carpet","student","imagination","superman","microwave","desk","mysterious","unnatural","grape","experience","pause","common","downtown","bubble"};

        int max = words.length - 1;
        int min = 0;
        int range = max - min + 1;

        int rand = (int) (Math.random() * range) + min;

        String randomWord = words[rand];

        return randomWord;

    }
}
