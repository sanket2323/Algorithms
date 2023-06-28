import java.util.ArrayList;

import java.util.Collections;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list1= new ArrayList<Integer>();

        //adding element to the arraylist
        list1.add(0);
        list1.add(1);
        list1.add(2);
        System.out.println(list1);

        //get method in arraylist

       int element= list1.get(0);
        System.out.println(element);

        //adding in between of the element

        list1.add(1,10);
        System.out.println(list1);

        int size=list1.size();

        //printing the arraylist using the for loop

        for (int i = 0; i < size; i++) {
            System.out.println(list1.get(i));
        }

        //sorting the array list using collection class

        Collections.sort(list1);

        System.out.println(list1);
    }
}
