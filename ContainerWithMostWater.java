import java.util.*;

public class ContainerWithMostWater{

    public static int storeWater(ArrayList<Integer> height){

        int maxWater = 0;

        //BRUTEFORCE APPROACH - TC- O(n^2)
        // for(int i=0; i<height.size(); i++){
        //     for(int j=i+1; j<height.size(); j++){
        //         int ht = Math.min(height.get(i), height.get(j));
        //         int width = j - i;
        //         int currWater = ht*width;

        //         maxWater = Math.max(currWater, maxWater);
        //     }
        // }
        // return maxWater;

        //TWO POINTER APPROACH - TC - O(n)
        int lp = 0;
        int rp = height.size()-1;

        while(lp < rp){

            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp - lp;
            int currWater = ht*width;
            maxWater = Math.max(currWater, maxWater);

            if(lp < rp){
                lp++;
            }else{
                rp--;
            }
        }
        return maxWater;
    }
    public static void main(String args[]){
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(storeWater(height));
    }
}