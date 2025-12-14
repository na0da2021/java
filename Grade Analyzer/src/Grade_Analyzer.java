import java.util.Scanner;
import java.util.Locale;

public class Grade_Analyzer {
    public static void main(String[] args) {
        System.out.println("=========== Grade Analyzer ===========");

        //variables
        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;
        int countF = 0;

        double Average;
        double sum = 0;
        double Highest_grade = 0;
        double Lowest_grade = 100;

        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Enter number of students: ");
        int student_num  = input.nextInt();
        if(student_num <= 0){
            System.out.println("Invalid number");
            return;
        }
        System.out.println();
        double[] grades = new double[student_num];
        char[] letter = new char[student_num];

        // for loop to take user inputs and store them
        for (int i = 0; i < student_num; i++) {
            System.out.print("Enter grade for student" + (i + 1) + " (0-100):");
            grades[i]= input.nextDouble();
            if(grades[i] < 0 | grades[i] > 100){
                System.out.println("Invalid Grade");
                return;
            }
            sum += grades[i];
            if (grades[i] > Highest_grade){
                Highest_grade = grades[i];
            }
            if (grades[i] < Lowest_grade){
                Lowest_grade = grades[i];
            }
        }
        Average = sum / student_num;

        // Grade distribution
        for (int j = 0; j < student_num; j ++) {
            //System.out.println("(int)grade/10 = " + (int)grades[j]/10);
            if((int)(grades[j]/10) == 10 | (int)(grades[j]/10) == 9){
                letter[j] = 'A';
                countA++;
            } else{
                switch((int)grades[j]/10){
                    case 8:
                        letter[j] = 'B';
                        countB++;
                        break;
                    case 7:
                        letter[j] = 'C';
                        countC++;
                        break;
                    case 6:
                        letter[j] = 'D';
                        countD++;
                        break;
                    default:
                        letter[j] = 'F';
                        countF++;
                        break;
                }
            }

        }

        System.out.println("\n=========== Grades Report ===========");
        for (int k = 0; k < student_num; k++) {
            System.out.println("Student " + (k+1) + ": " + grades[k] +" ("+letter[k]+")");
            }

        System.out.println("\n=========== Grades Distribution ===========");
        System.out.println("A: " + countA + " Student(s)");
        System.out.println("B: " + countB + " Student(s)");
        System.out.println("C: " + countC + " Student(s)");
        System.out.println("D: " + countD + " Student(s)");
        System.out.println("F: " + countF + " Student(s)\n");

        System.out.println("Average Grade: "+ (float)Average);
        System.out.println("Highest Grade: " + Highest_grade);
        System.out.println("Lowest Grade: " + Lowest_grade);

    }

}

