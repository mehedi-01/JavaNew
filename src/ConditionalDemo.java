import java.util.Scanner;

import static java.lang.Math.max;

public class ConditionalDemo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n1, n2,large;
        System.out.println("Enter Two Number :");

        n1 = input.nextInt();
        n2 = input.nextInt();

         large = max(n1, n2);

        System.out.println("large Number= "+ large);

    }
}
