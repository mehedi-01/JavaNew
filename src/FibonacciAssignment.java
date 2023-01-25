import java.util.Scanner;

public class FibonacciAssignment {

    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println(" Number: ");

        int num = input.nextInt();

        System.out.println("How Many Number: ");

        int n = input.nextInt();
        int first=0;
        int second=1;
        int fib;

        System.out.println(first+" "+second);

        for (int i = 3; i<=n; i++){
            fib = first+second;
            System.out.println(fib);
            first =second;
            second =fib;
        }
        System.out.println(num+" ");
    }
}
