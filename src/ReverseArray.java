import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
      int[] array ={1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(array));
        reverse(array);
        System.out.println(Arrays.toString(array));

    }
    public static void  reverse(int[] array){
        int length=array.length-1;

        for(int i=0;i<=length;i++){
          int temp=array[i];
          array[i]=array[length];
          array[length]=temp;
          length--;


        }



    }
}
