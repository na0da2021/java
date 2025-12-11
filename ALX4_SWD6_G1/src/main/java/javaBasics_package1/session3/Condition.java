package javaBasics_package1.session3;

import java.util.Scanner;

public class Condition {

    public static void main(String[] args) {

        // Taking String input from user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Hello Mr. " + name);

        // Taking integer input from user
        System.out.println("Enter your age: ");
        int age = input.nextInt();
        System.out.println("You are " + age + " years old.");

        // if condition
        if (age >= 18) {
            System.out.println("You can register");
        }

        // if-else condition
        if (age >= 18) {
            System.out.println("You are >= 18 years old");
            System.out.println("You can vote");
        } else {
            System.out.println("You are < 18 years old");
            System.out.println("You cannot vote");
        }

        // if-else-if ladder
        if (age >=18){
            System.out.println(">=18");
        } else if (age >=13) {
            System.out.println(">=13 and <18");
        } else if (age >=5) {
            System.out.println(">=5 and <13");
        } else {
            System.out.println("<5");
        }

        System.out.println("Program end!");



    }

}
