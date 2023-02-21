package Static_Block;

public class StaticBlock {
    static int  id ;
    static String name;


    static {

        id  = 232;
        name = "Nayeem";

    }
    static void display(){
        System.out.println("id :"+ id);
        System.out.println("Name :"+name);
    }

}
