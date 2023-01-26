import java.util.Scanner;

public class ValidUserAndPassAssignment {
    public static void main(String[] args) {

        Scanner input  = new Scanner(System.in);

        String user;
        int pass;

        while (true){
            System.out.println("Enter Username : ");
            user = input.nextLine();
            System.out.println("Enter Password : ");

            pass = input.nextInt();

            if (user.equals("Nayeem")&& pass==12345){
                System.out.println("Welcome to valid System");
                break;}
            else {
                System.out.println("user/pass invalid.try again  \n");
            }

        }


    }
}
