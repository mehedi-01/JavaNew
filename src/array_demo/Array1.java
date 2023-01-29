package array_demo;

public class Array1 {
    public static void main(String[] args) {

        int [] number = new  int[10];

        number[0] = 10;
        number[1] = 10;
        number[2] = 10;
        number[3] = 10;
        number[4] = 10;
        number[5] = 20;
        number[6] = 10;
        number[7] = 10;
        number[8] = 10;
        number[9] = 10;

        int sum = number[0] + number[1] + number[2]+number[3]+
                number[4]+number[5]+ number[6]+number[7]+
                number[8]+number[9];
        System.out.println("total array :"+sum);

        int len = number.length;

        System.out.println("Array Size : "+len);

    }
}
