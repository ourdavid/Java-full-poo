package estrutura_sequencial;

import java.util.Scanner;

/**
 * Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
 * casas decimais conforme exemplos.
 * Autor: David William
 *  */

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double area,x;

        System.out.print("Digite o raio do circulo: ");
        x = sc.nextDouble();
        area = Math.PI * Math.pow(x,2);

        System.out.printf("Area : %.4f",area);

    }
}
