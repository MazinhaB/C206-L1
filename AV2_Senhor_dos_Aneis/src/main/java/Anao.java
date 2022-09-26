public class Anao extends Habitante implements Mineracao{
    private float altura;
    private String reino;

    public void atacar(){
        System.out.println("O anao "+this.nome+" atacou");
        super.atacar();
    }
    @Override
    public void mostraInfo(){
        System.out.println("\n--- Informacoes do Anao ---");
        super.mostraInfo();
        System.out.println("Altura do anao: "+this.altura);
        System.out.println("O anao pertence ao reino "+this.reino);
    }

    @Override
    public void minerar() {
        System.out.println("O anao "+this.nome+" esta minerando");
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setReino(String reino) {
        this.reino = reino;
    }
}
