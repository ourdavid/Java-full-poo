package estrutura_sequencial;

import java.util.Scanner;
/**
 * Programa simples que lê dois números inteiros e mostra a soma.
 * Autor: David William
 * Data: 09/11/2025 */

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y,z;

        System.out.print("Digite o primeiro numero: ");
        x = sc.nextInt();

        System.out.print("Digite o segundo numero: ");
        y = sc.nextInt();

        z = x + y;
        System.out.println("Resultado");
        System.out.printf("Soma [%d + %d] : %d",x,y,z);
        sc.close();



    }
}
