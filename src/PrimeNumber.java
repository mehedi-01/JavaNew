import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Any Positive Number: ");
        int count = 0;

        int num  = input.nextInt();


        for (int i = 2; i< num; i++){
            if(num%i==0) {
                count++;
                break;
            }

        }
        if(count==0){
            System.out.println("Prime number");
        }
        else {
            System.out.println("Not Prime");
        }
    }

}
