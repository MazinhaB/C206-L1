public abstract class Habitante {
    public static int contador = 0;
    protected int id;
    protected String nome;
    protected int idade;
    protected float energia;
    Arma arma;

    public Habitante(){
        contador++;
        this.id = contador;
    }

    public void atacar(){
        if(this.arma == null){
            System.out.println("Esse heroi nao tem arma");
        }
        else{
            System.out.println("\n--- Informacoes da arma ---");
            System.out.println("Nome da arma: "+this.arma.getNomeArma());
            System.out.println("Magica: "+this.arma.isMagica());

            if(this.arma.isMagica()) {
                this.energia -= 20;
                System.out.println("Ataque com arma magica, energia apos ataque: "+this.energia);
            }
            else {
                this.energia -= 10;
                System.out.println("Ataque com arma normal, energia apos ataque: "+this.energia);
            }
        }
    }
    public void mostraInfo(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Id: "+this.id);
        System.out.println("Idade: "+this.idade);
        System.out.println("Energia: "+this.energia);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getEnergia() {
        return energia;
    }

    public void setEnergia(float energia) {
        this.energia = energia;
    }

}
