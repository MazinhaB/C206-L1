public class Mago extends Habitante implements Cura, Feitico{
    private String cor;

    public void atacar(){
        System.out.println("O mago "+this.nome+" atacou");
        super.atacar();
    }
    @Override
    public void mostraInfo(){
        System.out.println("\n--- Informacoes do Mago ---");
        super.mostraInfo();
        System.out.println("Cor do mago: "+this.cor);
    }

    @Override
    public void curar() {
        System.out.println("O habitante " +this.nome+" foi curado");
        this.energia = this.energia*1.15f;
        System.out.println("Nova energia: "+this.energia);
    }

    @Override
    public void lancaFeitico() {
        System.out.println("O mago "+this.nome+" lancou um feitico");
        this.energia=0.9f*this.energia;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
