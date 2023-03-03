package Person;

public class person {

    private String name;
   private int age;

    person(int age){
        this.age = age;
    }

   public void setName(String name){
       this.name = name;

    }
    public String getName(){
       return name;
    }

    public void printResult(){
        System.out.println("Your name is:"+ name);
        System.out.println("Your age is:"+ age);
    }

}
