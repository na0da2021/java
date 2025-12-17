import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.UK);

        System.out.print("Enter your Name: ");
        String name = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.print("Enter your Weight (Kg): ");
        double weight = input.nextDouble();

        System.out.print("Enter your Height (m): ");
        double height = input.nextDouble();

        double BMI = weight/((height)*(height));

        System.out.printf("Name: %s%nAge: %d%nWeight: %.2f(kg)%nHeight: %.2f(m)%nBMI: %.2f", name, age, weight, height, BMI);
    }
}
