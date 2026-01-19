import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // defining the users who registered on the system(can be extended to be an array of multiple users)
        // I will create only 2 users for simplicity
        User u1 = new User("mohamed@intrast.com", "mohamed123");
        User u2 = new User("nada2002@intrast.com", "None147$");

        User_Info u_info = new User_Info();
        //prompting the users to enter their credentials
        Scanner input = new Scanner(System.in);
        int count;
        for(count = 0; count < 3; count++){
            System.out.print("Enter your Email: ");
            String email = input.nextLine();
            System.out.print("Enter your password: ");
            String password = input.nextLine();

            if((email.equals(u1.get_mail()) && password.equals(u1.get_pass())) | (email.equals(u2.get_mail()) && password.equals(u2.get_pass()))){
                //next step (collect data)
                u_info.collect_data();

                // Display Collected Information
                System.out.println("code: " + u_info.code);
                System.out.println("Full Name: " + u_info.full_name);
                System.out.println("Age: " + u_info.age);
                System.out.println("score: " + u_info.score);
                System.out.println("Full Grade_letter: " + u_info.letter);

                break;
            } else {
                System.out.println("************************  Invalid credentials  ************************");
            }
        }
        System.out.println("count : " + count);
        if (count == 3){
            System.out.println("Account is locked, try contact one of the admins");
        }
        System.out.println("End of the program ❤️");


    }

}


