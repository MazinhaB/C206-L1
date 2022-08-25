public class Jardim {
    String nomeDono;
    String contato;
    String endereco;

    Arvore []arvore;

    public Jardim(String nomeDono, String contato, String endereco){//construtor
        this.nomeDono = nomeDono;
        this.contato = contato;
        this.endereco = endereco;
        arvore = new Arvore[10];  //cabem até 10 árvores
    }
    public void addArvore(Arvore arvore){
        int cont = 0;
        for(int i = 0; i < this.arvore.length; i++) {
            if (this.arvore[i] == null) {
                this.arvore[i] = new Arvore();
                this.arvore[i] = arvore;
                break;
            }
        }
    }
    public void replantar(){
        //planta com mais de 50cm de altura e caule com mais de 3cm de diâmetro
        for(int i = 0; i < this.arvore.length; i++)
            if(this.arvore[i]!=null){
                if(this.arvore[i].altura >= 50 && this.arvore[i].diametro >= 3)
                    System.out.println("A arvore "+this.arvore[i].especie+" ja pode ser replantada");
            }
    }
    public void precoMedio(){
        float total = 0;
        int cont = 0;
        for(int i = 0; i < this.arvore.length; i++)
            if(this.arvore[i] != null) {
                total += this.arvore[i].preco;
                cont++;
            }
        System.out.println("A media de precos das arvores cadastradas eh de "+(int)(total/cont)+" reais");
    }
    public void mostraInfo(){
        System.out.println("\n--- Informacoes do jardim ---");
        System.out.println("Nome do dono: "+this.nomeDono);
        System.out.println("Endereco: "+this.endereco);
        System.out.println("Contato do dono: "+this.contato);
        System.out.println("\n--- Informacoes das arvores ---");
        for(int i = 0; i < this.arvore.length; i++)
            if(this.arvore[i] != null) {
                System.out.println("Arvore "+(i+1)+": ");
                System.out.println("Especie: "+this.arvore[i].especie);
                System.out.println("Diametro do caule: "+this.arvore[i].diametro+"cm");
                System.out.println("Altura: "+this.arvore[i].altura+"cm");
                System.out.println("Preco: R$"+this.arvore[i].preco);
                System.out.println("");
            }
    }
}
