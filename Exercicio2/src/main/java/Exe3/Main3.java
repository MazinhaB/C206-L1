package Exe3;
import java.util.Scanner;
public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Estudante 1
        InfosContato ic = new InfosContato();
        Estudante e1 = new Estudante();
        e1.nome = "Mariana Barude";
        e1.idade = 20;
        ic.enderecoCasa = "Rua da Sense";
        ic.numTelefone = 886512000;
        ic.email = "mariana.barude@gec.inatel.br";
        e1.adicionarInfo(ic);

        //Estudante 2
        InfosContato ic2 = new InfosContato();
        Estudante e2 = new Estudante();
        e2.nome = "Maria Clara";
        e2.idade = 22;
        ic2.enderecoCasa = "Rua do Inatel";
        ic2.numTelefone = 99999999;
        ic2.email = "macla@gmail.com";
        e2.adicionarInfo(ic2);

        System.out.println("--- Info do Estudante 1 ---");
        System.out.print("Quantas horas o estudante 1 vai estudar? ");
        int horas = in.nextInt();
        e1.estudar(horas);
        e1.mostraInfo();

        System.out.println("\n--- Info do Estudante 2 ---");
        System.out.print("Quantas horas o estudante 2 vai estudar? ");
        horas = in.nextInt();
        e2.estudar(horas);
        e2.mostraInfo();

        in.close();

    }
}
