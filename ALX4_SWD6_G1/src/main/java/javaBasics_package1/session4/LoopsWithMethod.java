package javaBasics_package1.session4;

import java.util.Scanner;

public class LoopsWithMethod {
    static Scanner input = new Scanner(System.in);
    static int i;

    public static void main(String[] args) {

        // for loop
        int numberOfStudents = 10;

//        for (int i = 1; i <= numberOfStudents; i++) {
//            System.out.println("This is the student number : " + i);
//        }

//        Scanner input = new Scanner(System.in);
        System.out.println("Enter score");
        int studentScore = input.nextInt();
        for (int i = 1; i <= numberOfStudents ; i++ ) {
            gradeCalculation(studentScore);
//            System.out.println("Hello Student No. " + i);
//            System.out.println("Enter score");
//            int score = input.nextInt();
//
//            switch (score) {
//                case 100:
//                    System.out.println("You are 100% ya " + i);
//                    break;
//                case 0:
//                    System.out.println("Student " + i + "Not attend");
//                    break;
//                default:
//                    if (score > 0 && score < 50) {
//                        System.out.println("Student " + i + " is B");
//                    } else if (score >= 50 && score < 100) {
//                        System.out.println("Student " + i + " is A");
//                    } else {
//                        System.out.println("Wrong score ya " + i);
//                    }
//            }
//            System.out.println("Goodby ya " + i);
//            System.out.println(" * * * ");

        }

    }

    public static void gradeCalculation (int score){
        System.out.println("Hello Student No. " + i);
        switch (score) {
            case 100:
                System.out.println("You are 100% ya " + i);
                break;
            case 0:
                System.out.println("Student " + i + "Not attend");
                break;
            default:
                if (score > 0 && score < 50) {
                    System.out.println("Student " + i + " is B");
                } else if (score >= 50 && score < 100) {
                    System.out.println("Student " + i + " is A");
                } else {
                    System.out.println("Wrong score ya " + i);
                }
        }
        System.out.println("Goodby ya " + i);
        System.out.println(" * * * ");

    }
}