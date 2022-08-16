package Exe2;

public class Main2 {
    public static void main(String[] args) {
        //Info do carro 1
        Carro c1 = new Carro();
        c1.cor = "Preto";
        c1.modelo = "i3";
        c1.marca = "BMW";
        c1.velocidadeAtual = 80;
        c1.velocidadeMax = 220;
        c1.m.potencia = 170;
        c1.m.tipo = "Eletrico";

        //Info do carro 2
        Carro c2 = new Carro();
        c2.cor = "Branco";
        c2.modelo = "Focus";
        c2.marca = "Ford";
        c2.velocidadeAtual = 45;
        c2.velocidadeMax = 200;
        c2.m.potencia = 175;
        c2.m.tipo = "Combustao";

        System.out.println(" --- Carro 1 --- ");
        c1.ligar();
        c1.acelerar();
        c1.mostraInfo();
        System.out.println("\n--- Carro 2 ---");
        c2.ligar();
        c2.acelerar();
        c2.mostraInfo();

    }
}
