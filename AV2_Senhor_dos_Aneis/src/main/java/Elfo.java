public class Elfo extends Habitante implements Cura{
    private String tribo;

    public void viajar(){
        System.out.println("O elfo "+this.nome+" esta viajando");
    }
    public void atacar(){
        System.out.println("O elfo "+this.nome+" atacou");
        super.atacar();
    }
    @Override
    public void mostraInfo(){
        System.out.println("\n--- Informacoes do Elfo ---");
        super.mostraInfo();
        System.out.println("O elfo pertence a tribo "+this.tribo);
    }

    @Override
    public void curar() {
        System.out.println("O habitante " +this.nome+" foi curado");
        this.energia = this.energia*1.15f;
        System.out.println("Nova energia: "+this.energia);
    }
    public void setTribo(String tribo){
        this.tribo = tribo;
    }
}
