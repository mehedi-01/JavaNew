package array_demo;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] number = {10, 15, -2, 5, 7, 12};
        Arrays.sort(number);
        System.out.println("Ascending :");
        for (int i = 0; i < 5; i++) {
            System.out.print(" " + number[i]);
        }
        System.out.println();
        System.out.println("Descending :");
        for (int i = 5; i >=0; i--) {
            System.out.print(" " + number[i]);

        }
        System.out.println();
        String [] names = {"zahid","nil","farzana","rony"};
        Arrays.sort(names);
        for (int i = 0 ; i<4; i ++){
            System.out.println(names[i]);
        }
        System.out.println();


    }
}
