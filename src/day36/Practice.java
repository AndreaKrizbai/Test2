package day36;

import java.util.ArrayList;

public class Practice {

    public static void main(String[] args) {

        // create a ArrayList object of long and assign it to a variable

        ArrayList<Long> lst = new ArrayList<>();

//        C.R.U.D.
//                Create, Read, Update, Delete
        // add item ,insert an item ,  read item , update the item , remove the item , check the location ...

        lst.add(12L); // 12L is automatically converted to new Long(12L) ; because ArrayList only store object
        lst.add(100L);
        lst.add(150L);
        lst.add(200L);

        System.out.println("lst = " + lst);

        // Counting items inside ArrayList
        System.out.println("Counting items using lst.size() = " + lst.size());

        // Getting items inside ArrayList object
        System.out.println("\nFirst item is : lst.get(0) = " + lst.get(0));


        Long sum = 0L;
        for (int i = 0; i < lst.size(); i++) {
           sum = sum + lst.get(i);
        }
        System.out.println(sum);

        Long max = lst.get(0);
        for (int i = 0; i < lst.size(); i++) {
            if(max<lst.get(i)){
                max = lst.get(i);
            }
        }
        System.out.println(max);
    }
}