import java.util.Scanner;

public class Grading_sys {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean repeat = true;
        while(repeat) {
            System.out.print("Enter the score as integer num between 0 and 100: ");
            int score = input.nextInt();
            char grade;
            if (score >= 90) {
                grade = 'A';
            } else if (score >= 80) {
                grade = 'B';
            } else if (70 <= score) {
                grade = 'C';

            } else if (50 <= score) {
                grade = 'D';
            } else {
                grade = 'F';
            }
            System.out.println("Score is: " + score);
            System.out.println("Grade is: " + grade);

            System.out.print("Do you want to repeat the process (true/false)? ");
            repeat = input.nextBoolean();
        }
        System.out.print("**** End of the program ****");

    }
}