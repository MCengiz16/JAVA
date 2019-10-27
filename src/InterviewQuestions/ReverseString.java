package InterviewQuestions;

public class ReverseString {



    public static void main(String[] args) {
   reverseWithForLoop("hello");
   stringBuilder("World");
    }

    public static void stringBuilder(String word){


        StringBuilder sb =new StringBuilder(word);
        StringBuilder reversed= sb.reverse();
        System.out.println(reversed);
    }

    public static void reverseWithForLoop(String word){

        String reversed= "";

        for (int i=word.length()-1;i>=0;i--){
            reversed= reversed+word.charAt(i);

        }
        System.out.println(reversed);
    }
}
