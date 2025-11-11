package estrutura.condicional;

import java.util.Scanner;

/*
* Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
* casas decimais conforme exemplos.
* Fórmula da área: area = π . raio2
* Considere o valor de π = 3.14159
* */

public class Exercicio2 {
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Raio de um circulo: ");
        double raio = sc.nextDouble();

        double area = Math.PI * Math.pow(raio,2.0);

        System.out.printf("Area = %.4f%n",area);

        sc.close();
    }
}
