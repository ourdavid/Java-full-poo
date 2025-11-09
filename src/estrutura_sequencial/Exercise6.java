package estrutura_sequencial;

import java.util.Scanner;

/*
 * Read three double-precision floating point values: A, B, and C.
 * Then calculate and display:
 * a) the area of a right triangle where A is the base and C is the height.
 * b) the area of a circle with radius C. (pi = 3.14159)
 * c) the area of a trapezoid which has A and B as bases and C as height.
 * d) the area of a square that has side B.
 * e) the area of a rectangle that has sides A and B.
 */


public class Exercise6 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        double a,b,c,triangle,circle,trapezoid,square,rectangle;

        // input
        System.out.print("Value A: ");
        a = sc.nextDouble();
        System.out.print("Value B: ");
        b = sc.nextDouble();
        System.out.print("Value C: ");
        c = sc.nextDouble();

        // process

        triangle = a * c / 2;
        circle = Math.PI * Math.pow(c,2.0);
        square = b * b;
        rectangle = a * b;
        trapezoid = (a + b) * c / 2.0;

        // output
        System.out.println(triangle);
        System.out.println(circle);
        System.out.println(trapezoid);
        System.out.println(square);
        System.out.println(rectangle);

        sc.close();
    }
}
