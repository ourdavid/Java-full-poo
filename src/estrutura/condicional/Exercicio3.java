package estrutura.condicional;

import java.util.Scanner;

/*
* Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D)
*
* */
public class Exercicio3 {
    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor A: ");
        int a = sc.nextInt();

        System.out.print("Valor B: ");
        int b = sc.nextInt();

        System.out.print("Valor C: ");
        int c = sc.nextInt();

        System.out.print("Valor D: ");
        int d = sc.nextInt();

        int diferenca = a*b - c*d;

        System.out.printf("Diferenca = %d%n",diferenca);

        sc.close();
    }
}
