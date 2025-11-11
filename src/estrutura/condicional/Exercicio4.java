package estrutura.condicional;

import java.util.Scanner;

/*
* Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.
*
*
* */
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Numero do funcionario: ");
        int numero = sc.nextInt();

        System.out.print("Horas Trabalhadas: ");
        int horasTrabalhadas = sc.nextInt();

        System.out.print("Valor por hora: ");
        double valorHora = sc.nextDouble();

        double salario = horasTrabalhadas * valorHora;

        System.out.printf("Number = %d%n",numero);
        System.out.printf("Salary = U$ %.2f%n",salario);

        sc.close();
    }
}
