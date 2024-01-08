import java.util.ArrayList;
import java.util.*;

public class MaxInArrayList{
    public static void main(String args[]){

        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        System.out.println(list);

        //TC- O(N)
        int max = Integer.MIN_VALUE;
        for(int i=0; i<list.size(); i++){
            // if(max < list.get(i)){
            //     max = list.get(i);
            // }
            max = Math.max(max, list.get(i));
        }
        System.out.println("Maximum is: " + max);
    }
}