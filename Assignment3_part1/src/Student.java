public class Student {
    //attributes
    String name;
    int studentId;
    String major;
    double gpa = 0.0;

    //parameterized constructor
    public Student(String name, int studentId, String major ){
        this.name = name;
        this.studentId = studentId;
        this.major = major;
    }

    //method
    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + studentId);
        System.out.println("major: " + major);
        System.out.println("GPA: " + gpa);
    }

    public void updateGpa(double newGpa){
        System.out.println("GPA before updating: " + gpa);
        gpa = newGpa;
        System.out.println("GPA after updating: " + gpa);
    }

}
