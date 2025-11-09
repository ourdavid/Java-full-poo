package estrutura_sequencial;

import java.util.Scanner;

/*
*
* Write a program to read the code of part 1, the number of parts 1, the unit price of each part 1, the code of part 2,
* the number of parts 2 and the unit price of each part 2. Calculate and display the amount to be paid.
*
*/
public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int code1,code2,part1,part2;
        double getUnitValue1,getUnitValue2,value;

        // Input part one.
        System.out.print("Code part one: ");
        code1 = sc.nextInt();

        System.out.print("Number of part: ");
        part1 = sc.nextInt();

        System.out.print("Unit price: ");
        getUnitValue1 = sc.nextDouble();

        // Input part two.

        System.out.print("Code part Two: ");
        code2 = sc.nextInt();

        System.out.print("Number of part: ");
        part2 = sc.nextInt();

        System.out.print("Unit price: ");
        getUnitValue2 = sc.nextDouble();

        // Process


        value = (part1 * getUnitValue1) + (part2 * getUnitValue2);

        // OUTPUT Value

        System.out.printf("Value pay: %.2f",value);




        sc.close();
    }
}
