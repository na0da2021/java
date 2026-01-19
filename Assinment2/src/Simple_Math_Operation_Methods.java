public class Simple_Math_Operation_Methods {
    public static void main(String[] args) {

        double area = calculateArea(5.2, 3.1);
        System.out.println("Area is: " + area);

        printGreeting("Nada");
    }
    public static double calculateArea(double length, double width){
        return (length * width);
    }

    public static void printGreeting(String name){
        System.out.println("Hello " + name + "! Welcome to the java class");
    }

}
