package estrutura.condicional;

import java.util.Scanner;

// Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
//         mensagem explicativa, conforme exemplos.
public class Exercicio1 {
    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input
        System.out.print("Digite o primeiro numero: ");
        int primeiroValor = sc.nextInt();

        System.out.print("Digite o segundo numero: ");
        int segundoValor = sc.nextInt();

        // process
        int soma = primeiroValor + segundoValor;

        // output
        System.out.printf("Soma = %d%n",soma);

        sc.close();
    }
}
