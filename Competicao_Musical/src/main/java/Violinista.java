public class Violinista extends Musico implements Som{
    private String marcaBreu;
    private boolean usaEspaleira;

    @Override
    public void tocar() {
        System.out.println("\nO violinista "+this.nome+" esta tocando "+this.musica);
    }

    @Override
    public void mostraInfo(){
        System.out.println("\n--- Informacoes do Violinista ---");
        super.mostraInfo();
        System.out.println("Marca do Breu: "+this.marcaBreu);
        if(this.usaEspaleira)
            System.out.println("O violonista usa espaleira");
        else
            System.out.println("O violinista nao usa espaleira");
    }

    @Override
    public void desafinar() {
        if(this.usaEspaleira)
            this.pontuacao = (int) (this.pontuacao*0.95);
        else
            this.pontuacao = (int) (this.pontuacao*0.90);
        System.out.println("O Violinista desafinou e perdeu pontos");
    }

    public void setMarcaBreu(String marcaBreu) {
        this.marcaBreu = marcaBreu;
    }

    public void setUsaEspaleira(boolean usaEspaleira) {
        this.usaEspaleira = usaEspaleira;
    }
}
