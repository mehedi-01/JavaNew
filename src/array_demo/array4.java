package array_demo;

import java.util.Scanner;

public class array4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] A = new int[2][3];
        int[][] B = new int[2][3];
        int [][] C = new int[2][3];

        System.out.println("Enter Elements for A matrix :");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("A [%d][%d] = " ,row,col);
                A[row][col] = input.nextInt();


            }
            System.out.println();
        }
        System.out.println("Enter Elements for B matrix :");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("B [%d][%d] = " ,row,col);
                B[row][col] = input.nextInt();


            }
            System.out.println();
        }

        System.out.println("A = ");
        for (int row = 0; row<2; row++){
            for (int col = 0; col<3; col++){
                System.out.print("\t "+A[row][col]);
            }
            System.out.println("");

        }
        System.out.println("\n");


        System.out.println("B = ");
        for (int row = 0; row<2; row++){
            for (int col = 0; col<3; col++){
                System.out.print("\t "+B[row][col]);
            }
            System.out.println();
        }

        //adding And B matrix
        System.out.println("\n A+B = ");

        for (int row = 0; row<2; row++){
            for (int col = 0; col<3; col++ ){
                C [row][col] = A[row][col]+B[row][col];
                System.out.print("\t\t"+ (C[row][col]));

            }
            System.out.println("");
        }

    }
}
