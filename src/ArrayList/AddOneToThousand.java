package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class AddOneToThousand {
    public static void main(String[] args) {

        ArrayList<Integer> myList = new ArrayList<Integer>();
        System.out.println(myList);
        myList.add(0);
        System.out.println(myList);

        for (int i = 1; i<1000;i++){
          myList.add(i);
        }
        System.out.println(myList);

        System.out.println(myList.get(67));



        for(int i =0;i<1000;i++){
            System.out.println("element "+i+ ": "+myList.get(i));
       }

        Iterator myIter=myList.iterator();
        while(myIter.hasNext()){
            System.out.println(myIter.next());
        }

    }
}
