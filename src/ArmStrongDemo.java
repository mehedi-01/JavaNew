import java.util.Scanner;

public class ArmStrongDemo {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Armstrong Number :");

            int num, sum = 0,temp,r;
            num = input.nextInt();
            temp = num;

            while (temp!=0 ){
                r = temp %10;
                sum = sum + r*r*r;
                temp = temp / 10;

            }
            if (num==sum){
                System.out.println("Armstrong");
            }
            else{
                System.out.println("  Not Armstrong");
            }



        }
}
