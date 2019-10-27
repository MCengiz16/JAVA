package InterviewQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LargestNumberInArray {

    public static void main(String[] args) {
       forLoop();
       collections();
    }

    public static void collections() {
        Integer[] nums={1,2,3,9,4,5,6,7};
        List<Integer> list1= Arrays.asList(nums);
        Collections.sort(list1);

        System.out.println(list1.get(list1.size()-1));
    }

    public static void forLoop() {
        Integer[] nums={1,2,3,9,4,5,6,7};
        int largest=0;
        int temp;


        for(int i=0;i<nums.length-1;i++){
            temp=nums[i];
            if(temp>largest){
                largest=temp;
            }
        }
        System.out.println(largest);
    }
}
