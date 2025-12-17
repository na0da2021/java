// ----------------- Session Code -----------------

// First problem --> I is always 0 (solved by not declaring i again in the loop)
/*
2nd problem --> keeps the first entered "studentscore" as it even if new value is entered
(solved by removing the variable "score" which was not used  and using the global variable "studentscore")
*/


// ----------------- solution num#1 -----------------
package javaBasics_package1.session4;

import java.util.Scanner;

public class LoopsWithMethod {
    static Scanner input = new Scanner(System.in);
    static int i;

    public static void main(String[] args) {

        // for loop
        int numberOfStudents = 5;

        System.out.print("Enter score: ");
        int studentScore = input.nextInt();
        for (i = 1; i <= numberOfStudents ; i++ ) {
            gradeCalculation(studentScore);
            if (i == numberOfStudents){
                break;
            }
            System.out.println("Hello Student No. " + (i+1));
            System.out.print("Enter score: ");
            studentScore = input.nextInt();
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
        System.out.println("Goodbye ya " + i);
        System.out.println(" * * * ");

    }
}

// ----------------- solution num#2 -----------------
//package javaBasics_package1.session4;
//
//import java.util.Scanner;
//
//public class LoopsWithMethod {
//    static Scanner input = new Scanner(System.in);
//    static int i;
//
//    public static void main(String[] args) {
//
//        // for loop
//        int numberOfStudents = 5;
//        System.out.print("Enter score: ");
//        int studentScore = input.nextInt();
//
//        for ( i = 1; i <= numberOfStudents ; i++ ) {
//            //System.out.println("***** Start of for-loop ***** ");
//            if(i == 1){
//                gradeCalculation(studentScore);
//            } else {
//                System.out.print("Enter score: ");
//                studentScore = input.nextInt();
//                gradeCalculation(studentScore);
//            }
//            //System.out.println("***** End of for-loop ***** ");
//        }
//
//    }
//
//    public static void gradeCalculation (int score){
//        //System.out.println(" ***** Start of the method ***** ");
//        System.out.println("Hello Student No. " + i);
//        switch (score) {
//            case 100:
//                System.out.println("You are 100% ya " + i);
//                break;
//            case 0:
//                System.out.println("Student " + i + "Not attend");
//                break;
//            default:
//                if (score > 0 && score < 50) {
//                    System.out.println("Student " + i + " is B");
//                } else if (score >= 50 && score < 100) {
//                    System.out.println("Student " + i + " is A");
//                } else {
//                    System.out.println("Wrong score ya " + i);
//                }
//        }
//        System.out.println("Goodbye ya " + i);
//        //System.out.println(" ***** End of the method ***** ");
//
//    }
//}
