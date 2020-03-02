package DataStructure;

public class LinerSearch {

    public static void main(String[] args) {
        int[] numbers={5,7,2,13,55,23,67,21,92,37,45,24};
        int x=24;
        isFound(numbers,x);

    }
    static void isFound(int[] numbers, int x){
        boolean found=false;
        for (int i=0;i<numbers.length;i++) {
       if (numbers[i]==x){
           found= true;
           break;
            }

        }
        if (found){
            System.out.println("There is a "+x+" in this array");
        }
        else {
            System.out.println("There is no "+x+" in this array");
        }
    }

}
