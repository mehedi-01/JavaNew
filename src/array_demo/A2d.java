package array_demo;

import java.util.Scanner;

public class A2d {
    public static void main(String[] args) {
        Scanner input  =  new Scanner(System.in);

        int  [][] NUM = new int[4][5];
        int d = 0;
        for (int i = 0; i <4; i ++){
            for (int j = 0; j<5; j++){
                NUM[i][j] = d;
                d++;


            }
        }
        for (int i = 0; i <4; i ++){
            for (int j = 0; j<5; j++){
                System.out.print(" "+NUM[i][j]);

            }
            System.out.println();
        }

    }

}
