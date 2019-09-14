import java.util.Scanner;
class StringBackward {
    public static void main(String[] args) {
      Scanner read=new Scanner(System.in);

        System.out.println("Type your word.");
        String word= read.next();

        System.out.println(reverse(word));

    }
    public static String reverse(String word){
        String result="";
        for(int i=word.length()-1;i>=0;i--){

            result= result+ word.charAt(i);

        }
        return result;

    }
}
