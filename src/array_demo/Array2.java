package array_demo;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner input  =  new Scanner(System.in);
        double [] number = new double[5];
        double sum = 0;

        System.out.println("Enter Five Number : ");
        for (int i = 0; i<number.length; i++) {
            number[i] = input.nextDouble();
        }

        for (int i = 0; i<number.length; i++){
            sum = sum+number[i];

        }
        System.out.println("Final Number : "+sum);

        double avg = sum/5;
        System.out.println("The Avg Number : "+avg);

    }
}
