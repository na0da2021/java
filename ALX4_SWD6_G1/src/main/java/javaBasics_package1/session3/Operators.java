package javaBasics_package1.session3;

public class Operators {
    // Arithmetic Operators: +, -, *, /, %
    // Assignment Operators: =, +=, -=, *=, /=, %=
    // Comparison Operators: ==, !=, >, <, >=, <=
    // Logical Operators: &&, ||, !
    // Increment/Decrement Operators: ++, --
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
/*
        int sum = a + b; // Addition
        System.out.println("Sum= " + sum + " \nmulti = " + (a*b));
        // "xx" + "yy" > "xxyy" (Concatenation)

        // Assignment Operators
        System.out.println(b);
        b = b + 10;
        System.out.println(b);
        b +=10;
        System.out.println(b);

        a *=5; // a = a * 5
        System.out.println(a);
*/
        // Comparison Operators

//        System.out.println(a!=b);

        // Logical Operators
        boolean egyptian = true;
        boolean greaterThan18 = false;

        System.out.println(egyptian || greaterThan18);
        if (!egyptian) {
            System.out.println("Not Egyptian");
            a++; // a = a + 1
            b--; // b = b - 1
        }


    }
}
