import java.util.Arrays;

public class RandomArray {
    public static void main(String[] args) {
        int max = 5000;
        int min = 100;
        int length=10;

        int[] random=new int[length];

        for(int i=0;i<random.length;i++){
         random[i]= (int)(Math.random() * (max - min + 1)) + min;;
        }

        System.out.println(Arrays.toString(random));

    }
}
