package estrutura.condicional;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double saldo = 0;

        while (true){
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Ver saldo");
            System.out.println("4 - Sair");

            System.out.printf("%n Escolha uma opcao: ");
            int opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    System.out.print("Depositar: ");
                    double valorDeposito = sc.nextDouble();
                    saldo = deposito(saldo,valorDeposito);
                    break;
                case 2:
                    System.out.print("Sacar: ");
                    double valorSaque = sc.nextDouble();
                    saldo = saque(saldo,valorSaque);
                case 3:
                    verSaldo(saldo);
                    break;
                case 4:
                    System.out.print("!! Volte Sempre !! ");
                    sc.close();
                    return;
            }
        }




    }
    public static double deposito(double saldoValor,double depositoValor){
        return saldoValor + depositoValor;
    }
    public static void verSaldo(double x){
        System.out.printf("Saldo: %.2f%n",x);
    }
    public static double saque(double saldoValor,double saqueValor){
        return saldoValor - saqueValor;
    }

}
