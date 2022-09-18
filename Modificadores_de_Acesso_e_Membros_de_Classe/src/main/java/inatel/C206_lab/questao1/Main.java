package inatel.C206_lab.questao1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Conta []contas = new Conta[10];
        Scanner in = new Scanner(System.in);
        int i = 0; // contador
        int op;
        System.out.print("Digite 1 se deseja criar uma nova conta ou digite 2 se deseja sair: ");
        op = in.nextInt();
        while(i < contas.length && op == 1){
            if(contas[i] == null){
                contas[i] = new Conta();

                System.out.print("\nDigite o nome do cliente: ");
                in.nextLine();
                String nome = in.nextLine();
                contas[i].cliente = new Cliente();
                contas[i].cliente.setNome(nome);

                System.out.print("\nDigite o saldo disponivel: ");
                double saldo = in.nextDouble();
                contas[i].setSaldo(saldo);

                System.out.println("\n--- Opcoes ---");
                System.out.println("Digite 1 se deseja fazer um deposito");
                System.out.println("Digite 2 se deseja fazer um saque");
                System.out.println("Digite 3 se deseja consultar o extrato");
                System.out.println("Digite 4 para sair da conta");
                int op2 = in.nextInt();
                while(op2 != 4) {
                    switch (op2) {
                        case 1 -> {
                            System.out.print("\nValor do deposito: ");
                            double valor = in.nextDouble();
                            contas[i].deposita(valor);}
                        case 2 -> {
                            System.out.print("\nValor do saque: ");
                            double valor = in.nextDouble();
                            contas[i].saca(valor);}
                        case 3-> contas[i].extrato();
                    }
                    System.out.println("\n--- Opcoes ---");
                    System.out.println("Digite 1 se deseja fazer um deposito");
                    System.out.println("Digite 2 se deseja fazer um saque");
                    System.out.println("Digite 3 se deseja consultar o extrato");
                    System.out.println("Digite 4 para sair da conta");
                    op2 = in.nextInt();
                }
            }
            i++;
            System.out.print("Digite 1 se deseja criar uma nova conta ou digite 2 se deseja sair: ");
            op = in.nextInt();
        }
        in.close();
    }
}
