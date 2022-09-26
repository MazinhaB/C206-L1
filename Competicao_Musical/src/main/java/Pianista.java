public class Pianista extends Musico implements Tecnica, Tempo{
    private float alturaBanco;

    @Override
    public void tocar(){
        System.out.println("\nO pianista "+this.nome+" esta tocando "+this.musica);
    }
    @Override
    public void mostraInfo(){
        System.out.println("\n--- Informacoes do Pianista ---");
        super.mostraInfo();
        System.out.println("Altura do Banco: "+this.alturaBanco);
    }

    @Override
    public void tocarAcorde() {
        System.out.println("O pianista tocou um acorde");
    }

    @Override
    public void errarPausa() {
        this.pontuacao -= 25;
        System.out.println("O pianista errou a pausa da musica e vai recomecar");
    }

    public void setAlturaBanco(float alturaBanco) {
        this.alturaBanco = alturaBanco;
    }
}
