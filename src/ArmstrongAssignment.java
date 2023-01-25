import java.util.Scanner;

public class ArmstrongAssignment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Start Number :");
        int m = input.nextInt();

        System.out.println("End Number :");
        int n = input.nextInt();

        int totalArmstrong = 0;
        for (int i = m; i <= n; i++) {
            int temp, sum = 0, r;
            temp = i;

            while (temp != 0) {
                r = temp % 10;
                sum = sum * 10 + r*r*r;
                temp = temp / 10;
            }
            if(sum==i){
                totalArmstrong++;
            }
            System.out.println("Total armstrong number : "+totalArmstrong);

        }

    }

}
