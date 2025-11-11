package estrutura.condicional;

//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
//código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);



        System.out.print("Codigo peca #1: ");
        int codigoPeca1 = sc.nextInt();
        System.out.print("numeros de peca #1: ");
        int quantidaDePeca1 = sc.nextInt();
        System.out.print("valor unitario da peca #1: ");
        double valorUnitarioPeca1 = sc.nextDouble();

        System.out.print("Codigo peca #2: ");
        int codigoPeca2 = sc.nextInt();
        System.out.print("numeros de peca #2: ");
        int quantidadeDePeca2 = sc.nextInt();
        System.out.print("valor unitario da peca #2: ");
        double valorUnitarioPeca2 = sc.nextDouble();


        double valorTotalUm = quantidaDePeca1 * valorUnitarioPeca1;
        double valortTotalDois = quantidadeDePeca2 * valorUnitarioPeca2;

        double total = valorTotalUm + valortTotalDois;

        System.out.printf("Valor a pagar: R$ %.2f%n",total);


        sc.close();
    }
}
