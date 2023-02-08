package string_demo;

public class StringDemo1 {
    public static void main(String[] args) {
        String s1 = "Mehedi Hasan";
        String s2 = new String("Nayeem Hasan");

        System.out.println(s1);
        System.out.println(s2);
        if (s1.equals(s2)){
            System.out.println("Equals");
        }else {
            System.out.println("not Equals");
        }

        String [] name = {"anis","rahim","karim"};
        for (String x:name){
            System.out.println(x);

        }

    }
}
