import java.util.Scanner;

public class Area_of_triangle_and_Circle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double base, height, area;

        System.out.print("Enter base: ");
        base = input.nextDouble();

        System.out.print("Enter height : ");

        height = input.nextDouble();

        area= 0.5 * base * height;

        System.out.println("Enter Number : "+area);
    }
}
