package array_demo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ArrayOfWeekdays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        System.out.println("The Days Name 1-7 : ");
        int day = input.nextInt();
        for (int i = 0; i<days.length;i++){
            if (day==i+1){
                System.out.println(" "+days[i]);
            }
        }




    }
}
