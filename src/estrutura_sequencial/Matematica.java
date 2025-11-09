package estrutura_sequencial;

public class Matematica {
    public static void main(String[] args){
        double x,y,z;
        double a,b,c;

        x = 3.0;
        y = 4.0;
        z = 8.0;

        a = Math.sqrt(x);
        b = Math.sqrt(y);
        c = Math.sqrt(z);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        a = Math.pow(x,4.0);
        b = Math.pow(y,2.0);
        c = Math.pow(z,2.0);

        System.out.println();
        System.out.printf("%.2f elevado a 4.0 =  %.2f\n",x,a);
        System.out.printf("%.2f elevado a 2 =  %.2f\n",y,b);
        System.out.printf("%.2f elevado a 2 =  %.2f\n",z,c);


    }
}
