import java.util.Scanner;

public class DigitSpelling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int digit;

        System.out.println("Enter any digit :");
        digit = input.nextInt();

        switch(digit){

            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;

            case 4:
                System.out.println("Four");
                break;

            case 5:
                System.out.println("Five");
                break;

            default:
                System.out.println("Not a digit");

        }
    }
}
