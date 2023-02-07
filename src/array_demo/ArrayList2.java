package array_demo;

import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();
        System.out.println(" "+number.size());

        number.add(10);
        number.add(12);
        number.add(14);
        number.add(16);
        number.add(3,40);


        System.out.println("ArrayList contains : "+number);
        System.out.println();
        System.out.println("Size = "+number.size());

        number.clear();
        //System.out.println("After clear ArrayList contains : "+number);
        boolean check = number.isEmpty();
        System.out.println("Empty Array :"+check);

    }
}
