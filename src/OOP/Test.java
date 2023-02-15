package OOP;

public class Test {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        teacher1.name = "Nayeem";
        teacher1.gender = "male";
        teacher1.age = 27;
        teacher1.phone = 13_498_3980;


        System.out.println("Name :"+ teacher1.name);
        System.out.println("Gender :"+ teacher1.gender);
        System.out.println("Age :"+teacher1.age);
        System.out.println("Phone :"+teacher1.phone);

        Teacher teacher2 = new Teacher();
        teacher2.name = "hasan";
        teacher2.gender = "male";
        teacher2.age = 26;
        teacher2.phone = 13_4_3980;

        System.out.println();


        System.out.println("Name :"+ teacher2.name);
        System.out.println("Gender :"+ teacher2.gender);
        System.out.println("Age :"+teacher2.age);
        System.out.println("Phone :"+teacher2.phone);



    }

}
