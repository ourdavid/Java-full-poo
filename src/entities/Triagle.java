package entities;

public class Triagle {
    public double a;
    public double b;
    public double c;

    public double area(){
        double p = (a + b + c ) /2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
    public double areaMaior(double a,double b){
        if(a > b){
            return a;
        }else{
            return b;
        }
    }

}
