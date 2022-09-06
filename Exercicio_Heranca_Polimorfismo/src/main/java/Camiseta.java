public class Camiseta extends Produto{
    private String cor;
    private String tamanho;

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    @Override
    public String etiquetaPreco(){
        System.out.print("\n" + super.etiquetaPreco());
        String aux;
        aux = " - " + cor + " " + tamanho;
        return aux;
    }
}
