import java.util.Scanner;

public class Countdown_Timer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean repeat = true;
        while(repeat) {
            System.out.print("Enter a number greater than zero: ");
            int countdown = input.nextInt();
            if(countdown > 0) {
                while (countdown > 0) {
                    System.out.println("CountNum: " + countdown);
                    countdown--;
                }
                System.out.println("Launch");
            } else {
                System.out.println("Invalid Number");
            }
            System.out.print("Do you want to repeat the process (true/false)? ");
            repeat = input.nextBoolean();
        }
        System.out.print("**** End of the program ****");
        }
}
