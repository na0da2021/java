package javaBasics_package1.session2;

public class HelloProgram_class1 {

    public static void main(String[] args) {


        System.out.println("Program Start");
        // Method Calling  >> This is a single line comment
        sayingHello();
        sum(5,6);

        System.out.println(sum(2,4));
        System.out.println("Program End");

        // Creating an object of the Student class
        Student student1_object1 = new Student();
        student1_object1.name = "Mohamed";
        student1_object1.age = 25;
        student1_object1.address_variable1 = "Alex";

        // Creating an object of the Student class
        Student student2_object2 = new Student();
        student2_object2.name = "Ahmed";
        student2_object2.age = 30;
        student2_object2.address_variable1 = "Monoufia";

        Student student3 = new Student();
        student3.name = "Ahmed";
        student3.age = 50;
        student3.study();

        Teacher t1 = new Teacher();
        Teacher t2 = new Teacher();
        Teacher t3 = new Teacher();

        t1.name = "sayed";
        t1.teach();
        t1.instruct();

        Student st4 = new Student();
        st4.login("studentUser", "studentPass123");

    }

    public static void sayingHello() {
        System.out.println("Method Start");
        System.out.println("Hello, welcome to my first java program.");
        System.out.println("Method End");
    }
    public static int sum(int x, int y) {
        return x+y;
    }







   /*
        These are multiline comments
    This is a method to print statement to the console.
    Method declaration
    This method is developed by AlShafey
    */

//
//    student.name = name;

}
