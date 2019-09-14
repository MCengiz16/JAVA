import java.util.Scanner;

class PrintNextLetter {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        System.out.println("enter a word");
        String word =null;
        word=read.next();

        try{
            printNextLetter(word);
        }
        catch (Exception e){
            System.out.println("Please use letters from A to Y only");

        }

    }public static void printNextLetter(String word){
        char letter;
      for(int i=0;i<word.length();i++){
          letter= word.charAt(i);
          letter++;

              System.out.print(letter);

      }
    }
}
