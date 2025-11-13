package estrutura.repeticao;

import java.util.Scanner;

/*
* Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
* cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
* menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
*
* */
public class Exercicio1 {
    static public void main() {

        Scanner sc = new Scanner(System.in);

        int senha = 2002;

        while(true){
            int senhaTentativa = sc.nextInt();

            if (senha == senhaTentativa){
                System.out.println("Acesso Liberado!!");
                break;
            }else{
                System.out.println("Acesso Negado!!");
            }
        }

        sc.close();

    }
}
