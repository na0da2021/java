import java.util.Scanner;

public class Day_of_the_Week {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean repeat = true;

        String dayName;
        while(repeat) {
            System.out.print("Enter the day Number: ");
            int dayNumber = input.nextInt();
            switch (dayNumber) {
                case 1:
                    dayName = "Monday";
                    break;
                case 2:
                    dayName = "Tuesday";
                    break;
                case 3:
                    dayName = "Wednesday";
                    break;
                case 4:
                    dayName = "Thursday";
                    break;
                case 5:
                    dayName = "Friday";
                    break;
                case 6:
                    dayName = "Saturday";
                    break;
                case 7:
                    dayName = "Sunday";
                    break;
                default:
                    dayName = "None";
                    System.out.println("Invalid day Number");
            }
            System.out.println("day Name is: " + dayName);
            System.out.print("Do you want to repeat the process (true/false)? ");
            repeat = input.nextBoolean();
        }
        System.out.print("**** End of the program ****");
    }
}
