package string_demo;

public class NumberConversionDemo {
    public static void main(String[] args) {
        int  s  = 15;
        String binary = Integer.toBinaryString(s);
        System.out.println("Binary = "+binary);

        String oct  = Integer.toOctalString(s);
        System.out.println("Oct = "+oct);
        String Hex  = Integer.toHexString(s);
        System.out.println("Hex = "+Hex);


    }
}
