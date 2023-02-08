package string_demo;

public class NewString {
    public static void main(String[] args) {
        String country = "Bangladesh is my favorite country";
        System.out.println(country);


        char ch = country.charAt(0);
        System.out.println(ch);

        int val = country.codePointAt(0);
        System.out.println(val);

        int pos = country.indexOf('f');
        System.out.println(pos);

    pos = country.lastIndexOf('n');
        System.out.println(pos);
    }
}
