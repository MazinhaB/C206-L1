public class Produto {
    private double preco;
    private String nome;

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String etiquetaPreco() {
        String aux;
        aux = this.nome +" - R$" + this.preco;
        return aux;
    }
}
