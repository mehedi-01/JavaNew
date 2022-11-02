import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = 40;

        System.out.println("Enter any number : ");

        number = input.nextInt();

        System.out.println("Number = "+number);
    }
}

