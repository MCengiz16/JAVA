package StringMethods;

public class StringMethod {
    String sentence ;

    public StringMethod(String sentence) {
        this.sentence = sentence;
    }


    public StringMethod(){
        this.sentence = "java is fun";
    }


    public String reversed() {
        String reversed = "";
        for (int i = sentence.length() - 1; i >= 0; i--) {
            char letter = sentence.charAt(i);
            reversed = reversed + letter;
        }

        return reversed;
    }

    public String firstLetterUpperCase() {
        String uppercase = sentence.toUpperCase();
        String firstLetterUpperCase = Character.toString(uppercase.charAt(0));

        for (int i = 1; i < sentence.length(); i++) {

            firstLetterUpperCase = firstLetterUpperCase + sentence.charAt(i);
        }


        return firstLetterUpperCase;
    }

    public char[] asArray() {
        char[] charArray = new char[sentence.length()];
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = sentence.charAt(i);
        }


        return charArray;
    }

    public String[] wordArray() {
        int countWords = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == 32) {
                countWords++;
            }
        }
        String[] wordArray = new String[countWords + 1];
        String word = "";
        int wordNum = 0;
        for (int i = 0; i < sentence.length(); i++) {

            word = word + sentence.charAt(i);
            wordArray[wordNum] = word;


            if (sentence.charAt(i) == 32) {
                wordNum++;
                word = "";
            }
        }


        return wordArray;
    }
}
