import java.util.Scanner;

public class Series3 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        int n ,sum =0;

        System.out.println("Enter The Last Number: ");
        n = input.nextInt();


        for (int i =1; i <=n; i=i+1){
            System.out.print(i+"X"+i+" ");
            sum = sum+i*i;
        }
        System.out.println( "");
        System.out.println(sum);
    }
}
