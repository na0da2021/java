package javaBasics_package1.session3;

import javaBasics_package1.session2.Student;

public class Methods {

    public static void main(String[] args) {

        // Method calling

        hello();
//        greetingUser("Mohamed");
        System.out.println(greetingUser(" Mohamed"));

//        sum(10,20);
        System.out.println(sum(10,20));
        int salary = sum(1000,500);

        // calling method , and assign the returned object to a new object
        Student st1 = createStudent("Shafey", 31 , "Monoufia");
        Student st2 = createStudent("Ahmed", 25 , "Cairo");
        Student st3 = createStudent("Sara", 28 , "Giza");

    }

    // Methods declaration

    // method without return type and without parameters
    public static void hello() {
        System.out.println("Hello World");
    }
    // method without return type and with parameters
    public static String greetingUser(String name) {
        return ("Hello" + name);
    }
    public static int sum (int x , int y) {
        return x+y;
    }

//    method with Non-primitive (Reference)> [Object] return type and with parameters

    public static Student createStudent(String name, int age, String address) {
        System.out.println("\nCreating Student...");
        Student st = new Student();
        st.name = name;
        st.age = age;
        st.address_variable1 = address;
        System.out.println("Student Created: " + st.name + ", Age: " + st.age + ", Address: " + st.address_variable1);
        return st;
    }



}
