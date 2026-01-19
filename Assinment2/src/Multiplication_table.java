import java.util.Scanner;

public class Multiplication_table {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean repeat = true;
        while(repeat) {
            System.out.print("Enter a number up to 10: ");
            int baseNumber = input.nextInt();
            if (baseNumber <= 10) {
                for (int i = 1; i <= 10; i++) {
                    System.out.print(baseNumber + " x " + i);
                    System.out.println(" = "+ baseNumber * i);
                }
            } else {
                System.out.println("Invalid Number");
            }
            System.out.print("Do you want to repeat the process (true/false)? ");
            repeat = input.nextBoolean();
        }
        System.out.print("**** End of the program ****");
    }
}
