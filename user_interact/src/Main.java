import java.util.Scanner;
import java.util.Locale;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.print("Enter your GPA: ");
        //float gpa = input.nextFloat();
        double gpa = input.nextDouble();

        System.out.print("IsStudent? : ");
        boolean IsStudent = input.nextBoolean();

        System.out.println("name is: " + name);
        System.out.println("age is: " + age);
        System.out.println("gpa is: " + gpa);
        System.out.println("Is Student?: " + IsStudent);
    }

}