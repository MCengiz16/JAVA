import java.util.HashMap;

public class RepeatingWords {
    public static void main(String[] args) {
        String sentence="the best way to   understand java is the   practice    java   using java";
        String newSentence="";
        for (int i = 0; i < sentence.length()-1; i++) {
            if(sentence.charAt(i)==32&&sentence.charAt(i+1)==32){

            }
            else
                newSentence = newSentence+sentence.charAt(i);
        }

        String[] words=(sentence.split(" "));
        int count = 0;
        HashMap<String,Integer> repeat= new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (words[i].equalsIgnoreCase(words[j])) {
                    count = count + 1;
                }

            }
            repeat.put(words[i] ,count);
            count = 0;
        }

        System.out.println(repeat);
    }
}
