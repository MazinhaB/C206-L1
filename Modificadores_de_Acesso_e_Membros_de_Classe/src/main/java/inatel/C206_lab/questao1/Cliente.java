package inatel.C206_lab.questao1;

public class Cliente {
    private String nome; // nome do cliente
    private int id; // id do cliente
    private static int cont; // conta a quantidade de clientes

    public Cliente(){
        cont++;
        this.id = cont;
    }

    public static int getCont() {
        return cont;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
