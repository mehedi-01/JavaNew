package Overloading;

public class Teacher_overloading {

    String name, gender;
    int phone;

    Teacher_overloading(){
        System.out.println("No Info");

    }

    Teacher_overloading(String n, String g){

        name = n;
        gender = g;

    }
    Teacher_overloading(String n, String g, int p){
        name = n;
        gender = g;
        phone = p;

    }

    void displayInfo(){
        System.out.println("Name "+name);
        System.out.println("Gender "+gender);
        System.out.println("phone "+phone);

    }

}
