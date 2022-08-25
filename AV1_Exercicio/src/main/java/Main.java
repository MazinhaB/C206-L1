import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nomeDono;
        String endereco;
        String contato;
        int op;
        int cont = 0;

        System.out.println("Entre com as informacoes do jardim: ");
        System.out.print("Nome do dono: ");
        nomeDono = in.nextLine();
        System.out.print("Endereco do jardim: ");
        endereco = in.nextLine();
        System.out.print("Contato do dono: ");
        contato = in.nextLine();

        Jardim jardim = new Jardim(nomeDono, contato, endereco);
        System.out.println("--- Menu de opcoes ---");
        System.out.println("1 - Cadastrar nova arvore");
        System.out.println("2 - Estimar possibilidade de replantio");
        System.out.println("3 - Calcular a media dos precos das arvores cadastradas");
        System.out.println("4 - Mostrar informacoes");
        System.out.println("0 - Sair");
        System.out.print("Entre com a sua opcao: ");
        op = in.nextInt();
        while(op != 0 && cont < 10) {
            switch (op) {
                case 1 -> {
                    if(cont == 10)
                        System.out.println("Voce atingiu o limite maximo de plantacoes do jardim");
                    else {
                        Arvore arv = new Arvore();
                        System.out.print("Entre com a especie da arvore: ");
                        in.nextLine();
                        arv.especie = in.nextLine();
                        System.out.print("Entre com a altura da arvore: ");
                        arv.altura = in.nextFloat();
                        System.out.print("Entre com o diametro do caule: ");
                        arv.diametro = in.nextFloat();
                        System.out.println("Entre com o preco: ");
                        arv.preco = in.nextFloat();
                        jardim.addArvore(arv);
                        cont++;
                    }
                }
                case 2 -> jardim.replantar();

                case 3 -> jardim.precoMedio();

                case 4 -> jardim.mostraInfo();

                default -> System.out.println("Voce digitou uma opcao invalida");
            }
            System.out.println("--- Menu de opcoes ---");
            System.out.println("1 - Cadastrar nova arvore (maximo 10)");
            System.out.println("2 - Estimar possibilidade de replantio");
            System.out.println("3 - Calcular a media dos precos das arvores cadastradas");
            System.out.println("4 - Mostrar informacoes");
            System.out.println("0 - Sair");
            op = in.nextInt();
        }


    }
}
