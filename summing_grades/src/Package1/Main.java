package Package1;
import package2.Student_ID;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student_ID s1 = new Student_ID();
        Student_ID s2 = new Student_ID();
        Student_ID s3 = new Student_ID();

        int grade1, grade2, grade3;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the ID of student1:");
        s1.ID = input.nextInt();
        grade1 = s1.return_grade(s1.ID);

        System.out.print("Enter the ID of student2:");
        s2.ID = input.nextInt();
        grade2 = s2.return_grade(s2.ID);

        System.out.print("Enter the ID of student3:");
        s3.ID = input.nextInt();
        grade3 = s3.return_grade(s3.ID);

        System.out.println("grades average is " + (grade1 + grade2 + grade3)/3);


    }
}
