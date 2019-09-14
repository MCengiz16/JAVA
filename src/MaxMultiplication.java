import java.util.HashMap;

public class MaxMultiplication {
    public static void main(String[] args) {
        int[] nums={1,2,3,5,2,4};
        HashMap<Integer,Integer> bigger=new HashMap<>();
        int multiplication=0;
        int temp=0;
        int iTemp=0;
        for(int i=0;i<nums.length-1;i++){
            temp=nums[i]*nums[i+1];
            if (multiplication<temp){
                multiplication=temp;
                iTemp=i;
            }
            temp=0;

        }
        bigger.put(iTemp,nums[iTemp]);
        bigger.put(iTemp+1,nums[iTemp+1]);

        System.out.println(bigger);
        System.out.println(multiplication);
    }
}
