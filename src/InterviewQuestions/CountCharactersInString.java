package InterviewQuestions;

public class CountCharactersInString {

    public static void main(String[] args) {
    countChar("sddsfgjdhjd");

    }
    public static void countChar(String str){
        String temp ="new StringBuilder()";
        StringBuilder sb =new StringBuilder(str);



        int count=0;
        for(int i=0;i<str.length();i++){
            temp=sb.toString();
            for(int j=0;j<temp.length();j++){
                if(str.charAt(i)==temp.charAt(j)){

                     count++;
                     sb.replace(j,j+1,"_");
                }

            }
            if(count!=0){
            System.out.println(str.charAt(i)+" = "+count);
            count=0;}

        }
    }
}
