import java.util.Scanner;
class Skills {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);

        System.out.println("What is your skill? Java/SQL/Cloud");
        String Skill1 = read.next();


        if (Skill1.equalsIgnoreCase("Java") ) {
            System.out.println("what is your QA Score?");
            int qa= read.nextInt();
        if (qa<80){
            System.out.println("not accepted");}
        else System.out.println("accepted");
        }


        if (Skill1.equalsIgnoreCase("SQL") ) {
            System.out.println("what is your Hackerrank Score?");
            int hackerrank= read.nextInt();}

        if (Skill1.equalsIgnoreCase("Cloud") ) {
            System.out.println("what is your Certification?");
            int cert= read.nextInt();}

        else
            System.out.println("No skills");




    }
}
