import java.util.ArrayList;

public class ArrayListBasics{
    public static void main(String args[]){

        //********************************SYSNTAX TO CREATE ARRAYLIST *********************************//

        //ArrayList of Integers
        ArrayList<Integer> list = new ArrayList<>();

        //ArrayList of Strings
        // ArrayList<Strings> list2 = new ArrayList<>();

        //ArrayList of Boolean
        // ArrayList<Boolean> list3 = new ArrayList<>();

        //**********************************Operations on ArrayList*********************************//

        //ADD ELEMENT - TC-O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        //Another method to add - TC- O(n)
        // list.add(2,9);

        System.out.println(list + " ");

        //GET ELEMENT - O(1)
        // int element = list.get(2);
        // System.out.println(element);

        // //REMOVE ELEMENT - O(n)
        // list.remove(2);
        // System.out.print(list + " ");

        //SET ELEMENT AT INDEX - TC - O(n)
        // list.set(2,10); //at index 2 set 10
        // System.out.print(list + " ");

        //CONTAINS ELEMENT - TC- O(N)
        // System.out.println(list.contains(1));
        // System.out.println(list.contains(11));

    //****************************************** SIZE OF ARRAYLIST **************************************//
        int size = list.size();
        System.out.println(size);

        //To iterate on ArrayList 
        for(int i=0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }

    }
}