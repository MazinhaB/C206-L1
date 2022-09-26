public class Cellista extends Musico implements Som{
    private boolean sentado;

    @Override
    public void tocar(){
        System.out.println("\nO cellista "+this.nome+" esta tocando "+this.musica);
    }
    @Override
    public void mostraInfo(){
        System.out.println("\n--- Informacoes do Cellista ---");
        super.mostraInfo();
        if(this.sentado)
            System.out.println("O cellista toca sentado");
        else
            System.out.println("O cellista toca de pe");
    }
    @Override
    public void desafinar() {
        this.pontuacao = (int) (this.pontuacao*0.95);
        System.out.println("O cellista desafinou e perdeu pontos");
    }

    public void setSentado(boolean sentado) {
        this.sentado = sentado;
    }
}
