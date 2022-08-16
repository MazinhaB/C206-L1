package Exe2;

public class Carro {
    //Atributos
    String cor;
    String marca;
    String modelo;
    double velocidadeMax;
    double velocidadeAtual;

    Motor m = new Motor();
    //Métodos
    public void ligar(){
        System.out.println("VRUMVRUM (carro ligado)");
    }
    public void acelerar(){
        System.out.println("RANDANDANDAN (acelerando)");
    }
    public void mostraInfo(){
        System.out.println("--- Info do Carro ---");
        System.out.println("Cor: "+this.cor);
        System.out.println("Marca: "+this.marca);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Velocidade maxima: "+this.velocidadeMax);
        System.out.println("Velocidade atual: "+this.velocidadeAtual);
        this.m.mostraInfo();
    }
}
