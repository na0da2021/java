package javaBasics_package1.session2;

public class Student {

    // Fields / Attributes
    public String address_variable1;
    public String name;
    public int age;

    private boolean isLoggedIn = false;
    private final String USERNAME = "studentUser";
    private final String PASSWORD = "studentPass123";

    // methods
    public void study() {
        System.out.println("Student is studying");
    }

    // method to modify private fields with conditions (Encapsulation)
    public void login(String user, String pass) {
        if (USERNAME == user && PASSWORD == pass) {
            isLoggedIn = true;
            System.out.println("Login successful");
        } else {
            System.out.println("Login failed");
        }
    }




}
