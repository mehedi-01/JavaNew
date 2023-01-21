import java.util.Scanner;

public class CallCenter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int digit;
        System.out.println("Call Center Language: ");

         digit = input.nextInt();

         switch (digit){
             case 1:
                 System.out.println("bengali");
                 break;
             case 2:
                 System.out.println("hindi");
                 break;
             case 3:
                 System.out.println("urdu");
                 break;
             default:
                 System.out.println("english");
         }


    }
}
