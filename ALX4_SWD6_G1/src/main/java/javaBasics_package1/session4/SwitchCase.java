package javaBasics_package1.session4;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        // Example 1
        /**
        String color = "white";

        switch (color) {
            case "red" :
                System.out.println("the color is red");
                break;
            case "white" :
                System.out.println("the color is white");
                break;
            default:
                System.out.println("invalid color");
        }
        */

        // Example 2
        Scanner input = new Scanner(System.in);
        System.out.println("Enter score");
        int score = input.nextInt();

        switch (score){
            case 100 :
                System.out.println("You are 100%");
                break;
            case 0 :
                System.out.println("Not attend");
                break;
            default:
                if (score > 0 && score < 50) {
                    System.out.println("B");
                } else if (score >= 50 && score < 100) {
                    System.out.println("A");
                } else {
                    System.out.println("Wrong score");
                }
        }

    }
}
