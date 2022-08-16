package Exe1;
import java.lang.Math;
public class Calculadora {
    //Métodos
    public double soma(double x, double y){
        return (x + y);
    }
    public double subtracao(double x, double y){
        return (x - y);
    }
    public double multiplicacao(double x, double y){
        return (x * y);
    }
    public double divisao(double x, double y){
        return (x / y);
    }
    public double exponenciacao(double x, double y){
        return Math.pow(x, y);
    }

}
