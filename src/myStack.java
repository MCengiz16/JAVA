import java.util.Stack;
public class myStack {
    public static void main(String[] args) {
        Stack<Integer> myStack=new Stack<>();
        Integer[] myArr={1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        double random;

        for(int i=0;i<100;i++){
            random=Math.random()*13+1;
            myStack.push(myArr[(int)random]);
        }
        for(int i=0;i<100;i++){

            System.out.println(myStack.pop());
        }

    }



}
