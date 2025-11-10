package estrutura.sequencial;

import java.util.Scanner;

/*
* Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
* hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
* decimais
*
* */

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do Funcionario: ");
        String nome = sc.nextLine();

        System.out.print("ID: ");
        int id = sc.nextInt();

        System.out.print("Horas trabalhadas: ");
        int horasTrabalhadas = sc.nextInt();

        System.out.print("Valor que recebe por hora: ");
        double valorPorHora = sc.nextDouble();

        // Processamento

        double salary = horasTrabalhadas * valorPorHora;

        // Dados do funcionario
        System.out.printf("Nome: %s\n",nome);
        System.out.printf("ID: %d \n",id);
        System.out.printf("Salario: U$ %.2f\n", salary);

        sc.close();

    }
}
