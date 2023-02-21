package Overloading;

public class Teacher_Test {
    public static void main(String[] args) {
        Teacher_overloading teacher1 = new Teacher_overloading();

        Teacher_overloading teacher2 = new Teacher_overloading("Hasan","Male");
        teacher2.displayInfo();

        Teacher_overloading teacher3 = new Teacher_overloading("Ira","Female",4546645);
        teacher3.displayInfo();




    }

}
