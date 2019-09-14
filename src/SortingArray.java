import java.util.Arrays;
import java.util.Scanner;
class SortingArray {
    public static void main(String[] args) {

        int[] array=getIntegers(5);
        int[] sorted= sortIntegers(array);
        printArray(sorted);

    }
    public static int[] getIntegers(int capacity ){
Scanner read = new Scanner(System.in);
int[] myArray=new int[capacity];
        System.out.println("Enter " +capacity+ " number.");
        for (int i=0;i<myArray.length;i++){
            myArray[i]=read.nextInt();
        }

        return myArray;

    }
    public static void printArray(int[] numbers){
        System.out.println("Values are sorted.");
        for(int i=0;i<numbers.length;i++){
            System.out.println("Element "+i+" value is "+ numbers[i]);
        }

    }
    public static int[] sortIntegers(int[] unsorted){
        int[] sorted= Arrays.copyOf(unsorted,unsorted.length);

        //Used method above to copy array instead of codes below.

        //int[] sorted= new int[unsorted.length];
       // for (int i=0;i<unsorted.length;i++){
           // sorted[i]=unsorted[i];
       // }

        boolean flag=true;
        int temp;
        while(flag){
            flag=false;
            for(int i=0;i<sorted.length-1;i++){
                if(sorted[i]<sorted[i+1]){
                    temp=sorted[i];
                    sorted[i]= sorted[i+1];
                    sorted[i+1]=temp;
                    flag=true;

                }
            }
        }




        return sorted;
    }
}
