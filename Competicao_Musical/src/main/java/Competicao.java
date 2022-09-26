public class Competicao {
    Musico []competidores = new Musico[20];

    public void addMusico(Musico musico){
        for(int i = 0; i < this.competidores.length; i++){
            if(this.competidores[i] == null){
                this.competidores[i] = musico;
                break;
            }
        }
    }
    public void listarCompetidores(){
        for(int i = 0; i < this.competidores.length; i++){
            if(this.competidores[i] != null){
                if(competidores[i] instanceof Cellista){
                    Cellista cellista = (Cellista) competidores[i];
                    cellista.tocar();
                    cellista.desafinar();
                    cellista.mostraInfo();
                }
                else if(competidores[i] instanceof Violinista){
                    Violinista violinista = (Violinista) competidores[i];
                    violinista.tocar();
                    violinista.desafinar();
                    violinista.mostraInfo();
                }
                else if(competidores[i] instanceof Pianista){
                    Pianista pianista = (Pianista) competidores[i];
                    pianista.tocar();
                    pianista.errarPausa();
                    pianista.tocarAcorde();
                    pianista.mostraInfo();
                }
            }
        }
    }
}
