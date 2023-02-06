package array_demo;

import java.util.ArrayList;
public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();
        System.out.println(" "+number.size());

        number.add(10);
        number.add(12);
        number.add(14);
        number.add(16);
        number.add(3,40);
        System.out.println(number);
        System.out.println("Size = "+number.size());





    }

}
