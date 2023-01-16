import java.util.Scanner;

public class LogicalOperator {
    public static void main(String[] args) {

        Scanner input =  new Scanner(System.in);

        System.out.println("Enter Any Letter: ");

        char ch = input.next().charAt(0);

        if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
            System.out.println("Consonant");
        } else {
            System.out.println("Vowel");
        }
    }
}
