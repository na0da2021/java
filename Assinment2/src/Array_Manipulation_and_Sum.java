public class Array_Manipulation_and_Sum {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int sum = 0;
        System.out.println("Third number: "+ numbers[2]);
        numbers[0] = 99;
        for (int number : numbers){
            sum += number;
        }
        System.out.println("Final sun: " + sum);
    }
}
