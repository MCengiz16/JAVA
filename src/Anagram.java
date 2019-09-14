import java.util.HashMap;

public class Anagram {
    public static void main(String[] args) {
        HashMap<String,String> anagram=new HashMap<>();
        String[] words = {"cat", "cta", "car", "care", "race", "cra"};
        int word = 0;
        int wordTemp = 0;

        for (int i = 0; i < words.length; i++) {

            for (int l = 0; l < words[i].length(); l++) {
                word = word + words[i].charAt(l);

            }
            for (int k = i+1; k < words.length; k++) {
                for (int j = 0; j < words[k].length(); j++) {
                    wordTemp = wordTemp + words[k].charAt(j);

                }
                if (word == wordTemp && words[i].length() == words[k].length() && i != k) {
                    anagram.put(words[i] , words[k] );
                }

                wordTemp = 0;
            }
            word = 0;


        }
        System.out.println(anagram);
    }


}
