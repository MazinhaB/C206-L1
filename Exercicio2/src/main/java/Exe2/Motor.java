package Exe2;

public class Motor {

    //Atributos
    String tipo;
    int potencia;

    //Métodos
    public void mostraInfo(){
        System.out.println("--- Info do Motor ---");
        System.out.println("Tipo do motor: "+this.tipo);
        System.out.println("Potencia do motor: "+this.potencia);
    }
}
