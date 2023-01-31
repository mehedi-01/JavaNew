package array_demo;


import java.util.ArrayList;
import java.util.List;

public class Array3 {
    public static void main(String[] args) {

/*        int[] num = {12, 12, 44, 34, 23,78,14,45,78};
        int sum = 0;
        for (int x: num){
            sum = sum+x;


        }
        System.out.println(sum);*/

        Person person = new Person();
        for(String s: person.getNames())
        {
            System.out.println(s);
        }

    }

}




