import java.util.Scanner;

public class MultipleTimeNestedFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,m;
        System.out.println("Enter Initial number: ");
        m = input.nextInt();

        System.out.println("Enter final number: ");
        n = input.nextInt();

        for (int i = m; i<= n; i++){


            for (int j =1; j <= 10; j++){
                System.out.println(i+ " X " +j+" = "+i*j);


            }
            System.out.println(" \n \n");

        }


    }

}
