import java.util.Scanner;

public class PalindromeAssignment {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Start Number :");
        int m = input.nextInt();

        System.out.println("End Number :");
        int n = input.nextInt();

        int totalPalindromeNumber = 0;
        for (int i = m; i <= n; i++) {
            int temp, sum = 0, r;
            temp = i;

            while (temp != 0) {
                r = temp % 10;
                sum = sum * 10 + r;
                temp = temp / 10;
            }
            if (sum == i) {
                totalPalindromeNumber++;
            }
        }

        System.out.println("Total Palindrome number : " + totalPalindromeNumber);
    }
}
