public class GradeBook {
    public static void main(String[] args) {
        int grade = 100;

        if (grade<0 || grade>100){
            System.out.println("Invalid");}

        else if (grade<50){
            System.out.println("F");}
        else if (grade<60){
            System.out.println("D");}
        else if (grade<70){
            System.out.println("C");}
        else if (grade<80){
            System.out.println("B");}
        else if (grade<90){
            System.out.println("A-");}
        else {
            System.out.println("A+");}

        }
    }

