package package2;

/* i have 3 students in the class:
Ahmed: id --> 1 & Grade 50
Mohamed: id --> 2 & Grade 45
Nada: id --> 3 & Grade 52
 */
public class Student_ID {
    public int ID;

    public int return_grade(int x) {
       if(x == 1){
           System.out.println("HI Ahmed, ur grade is 50");
           return 50;
       } else if (x == 2) {
           System.out.println("HI Mohamed, ur grade is 45");
           return 45;
       } else if (x == 3) {
           System.out.println("HI Nada, ur grade is 52");
           return 52;
       } else {
           System.out.println("Not defined");
           return -1;
       }
    }

}
