package estrutura.condicional;

import java.util.Scanner;

public class Exercise6 {
    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int higher = max(a,b,c);
        showResult("Maior: ",higher);

        sc.close();
    }
    public static int max(int x,int y,int z){
        if (x > y && x > y){
            return  x;
        } else if (y > x && y > z) {
            return y;
        }else{
            return z;
        }
    }
    public static void showResult(String x,int y){
        System.out.printf("%s %d%n",x,y);
    }


}
