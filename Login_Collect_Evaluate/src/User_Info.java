import java.util.Scanner;

public class User_Info {

    //attribute
    String code;
    String full_name;
    int age;
    int score;
    char letter;

    //method
    public void collect_data() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Code: ");
        code = input.nextLine();

        System.out.print("Enter Your Full Name: ");
        full_name = input.nextLine();

        System.out.print("Enter Your Age: ");
        age = input.nextInt();

        enter_score();
        System.out.println("Data Collected Successfully ❤️");

        set_letter();

    }

    public void enter_score() {
        boolean repeat = true;
        Scanner input = new Scanner(System.in);
        while (repeat) {
            System.out.print("Enter Your Score(0 : 100): ");
            score = input.nextInt();

            if ((score > 100) | (score < 0)) {
                System.out.println("Invalid score");
            } else {
                repeat = false;
            }

        }
    }

    public void set_letter(){
        if (score <= 100 && score >= 90){
            letter = 'A';
        } else if (score >= 80){
            letter = 'B';
        } else if (score > 70 ) {
            letter = 'C';
        } else if (score > 60) {
            letter = 'D';
        } else {
            letter = 'F';
        }
    }
}
