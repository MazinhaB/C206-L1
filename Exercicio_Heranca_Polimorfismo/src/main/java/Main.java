import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Produto[] produtos = new Produto[50];
        Scanner in = new Scanner(System.in);
        int op; //1 -> notebook, 2 -> camiseta, 3 -> sair
        int i = 0; //contador
        String aux; // auxiliar para ler strings
        double aux2; // auxiliar para ler double

        System.out.print("Entre com o nome do produto (Notebook ou Camiseta): ");
        aux = in.nextLine(); //nome do produto
        if(Objects.equals(aux, "Notebook"))
            op = 1;
        else if(Objects.equals(aux, "Camiseta"))
            op = 2;
        else
            op = 3;
        while (op != 3) {
            System.out.print("Entre com o preco do produto: ");
            aux2 = in.nextDouble();
            switch (op) {
                case 1 -> {
                    Notebook n = new Notebook(); //auxiliar para criar o notebook
                    n.setNome(aux);
                    n.setPreco(aux2);

                    System.out.print("Entre com o armazenamento do Notebook: ");
                    aux2 = in.nextDouble();
                    n.setArmazenamento(aux2);

                    System.out.print("Entre com a GPU: ");
                    in.nextLine();
                    aux = in.nextLine();
                    n.setGpu(aux);

                    System.out.print("Entre com o processador: ");
                    aux = in.nextLine();
                    n.setProcessador(aux);
                    produtos[i] = n;
                    i++;
                }
                case 2->{
                    Camiseta c = new Camiseta(); //auxiliar para criar a camiseta
                    c.setNome(aux);
                    c.setPreco(aux2);

                    System.out.print("Entre com a cor da camiseta: ");
                    in.nextLine();
                    aux = in.nextLine();
                    c.setCor(aux);

                    System.out.print("Entre com o tamanho da camiseta: ");
                    aux = in.nextLine();
                    c.setTamanho(aux);
                    produtos[i] = c;
                    i++;
                }
            }
            if(i < 2)
                System.out.print("Entre com o nome do produto (Notebook ou Camiseta): ");
            else
                System.out.print("Entre com o nome do produto (Notebook ou Camiseta) ou 'sair' se desejar encerrar: ");
            aux = in.nextLine(); //nome do produto
            if(Objects.equals(aux, "Notebook"))
                op = 1;
            else if(Objects.equals(aux, "Camiseta"))
                op = 2;
            else
                op = 3;
        }
        for(i = 0; i < produtos.length; i++)
        {
            if(produtos[i] != null)
                System.out.println(produtos[i].etiquetaPreco());
        }
        in.close();
    }
}
