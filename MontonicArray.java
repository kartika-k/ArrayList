//An Arraylist is monotonic if it is either monotone increasing or monotone decreasing.
//An Arraylist nums is monotone increasing if for all i <= j, nums.get(i) <= nums.get(j). An
//Arraylist nums is monotone decreasing if for all i <= j, nums.get(i) >= nums.get(j).
//Given an integer Arraylist nums, return true if the given list is monotonic, or false otherwise.

import java.util.*;

public class MontonicArray{

    public static Boolean isMontonic(ArrayList<Integer> nums){
        Boolean inc = true;
        Boolean dec = true;

        for(int i=0; i<nums.size()-1; i++){
            if(nums.get(i) > nums.get(i+1)){
                inc = false;
            }
            if(nums.get(i) < nums.get(i+1)){
                dec = false;
            }
        }
        return inc || dec;
    }
    public static void main(String args[]){

        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(1);
        nums.add(2);
        nums.add(2);
        nums.add(3);
       

        System.out.println(isMontonic(nums));
    }
}