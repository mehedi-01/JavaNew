import java.util.Scanner;

public class voter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

         int num = 0;
        System.out.println("Person Age: ");
        num = input.nextInt();

        if(num>18) {

            System.out.println(" Valid Voter");
        }
        else{
            System.out.println("Invalid voter");
        }

    }
}
