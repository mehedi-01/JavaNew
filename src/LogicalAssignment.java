import java.util.Scanner;

public class LogicalAssignment {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Do You Java Lover? ");

        char ch = input.next().charAt(0);

        if(ch == 'Y'){
            System.out.println("You are java lover");

        }
        else if(ch=='N') {
            System.out.println("you are not java lover");
        }
    }
}
