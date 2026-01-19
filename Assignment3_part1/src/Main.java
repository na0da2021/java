public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Nada Mohamed", 123, "ECE");
        Student s2 = new Student("Mariam Ahmed", 963, "EEC");

        s1.displayInfo();
        System.out.println("************************");
        s2.displayInfo();

        System.out.println("************ Updating GPA of s1 ************");
        s1.updateGpa(3.59);
        System.out.println("************************");
        s1.displayInfo();


    }
}
