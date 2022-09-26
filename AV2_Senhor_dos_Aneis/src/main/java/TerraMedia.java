public class TerraMedia {
    private Habitante []herois = new Habitante[20];

    public void addHabitante(Habitante habitante){
        for(int i = 0; i < this.herois.length; i++)
            if(this.herois[i] == null){
                this.herois[i] = habitante;
                break;
            }
    }
    public void listarHabitantes(){
        for(int i = 0; i < this.herois.length; i++){
            if(this.herois[i] != null){
                if(herois[i] instanceof Anao){
                    ((Anao) herois[i]).mostraInfo();
                    ((Anao) herois[i]).atacar();
                    ((Anao) herois[i]).minerar();
                }
                else if(herois[i] instanceof Elfo){
                    ((Elfo) herois[i]).mostraInfo();
                    ((Elfo) herois[i]).atacar();
                    ((Elfo) herois[i]).curar();
                    ((Elfo) herois[i]).viajar();
                }
                else if(herois[i] instanceof Mago){
                    ((Mago) herois[i]).mostraInfo();
                    ((Mago) herois[i]).atacar();
                    ((Mago) herois[i]).lancaFeitico();
                    ((Mago) herois[i]).curar();
                }
            }
        }
    }
}
