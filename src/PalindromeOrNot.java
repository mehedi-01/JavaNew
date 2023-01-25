import java.util.Scanner;

public class PalindromeOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Reverse Number :");

        int num, sum = 0,temp,r;
        num = input.nextInt();
        temp = num;

        while (temp!=0 ){
            r = temp %10;
            sum = sum * 10 + r;
            temp = temp / 10;

        }
        if (num==sum){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("  Not Palindrome");
        }



    }
}
