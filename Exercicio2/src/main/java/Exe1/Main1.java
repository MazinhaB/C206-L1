package Exe1;
import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Entre com 2 valores: ");
        Calculadora c = new Calculadora();

        double x = in.nextDouble();
        double y = in.nextDouble();

        System.out.println("Entre com o numero equivalente a operacao que deseja realizar: ");
        System.out.print("1 - Soma, 2 - Subtracao, 3 - Multiplicacao, 4 - Divisao, 5 - Exponenciacao: ");
        int op = in.nextInt();

        while(op != 0) {
            switch (op) {
                case 1 -> System.out.println(x + " + " + y + " = " + c.soma(x, y));
                case 2 -> System.out.println(x + " - " + y + " = " + c.subtracao(x, y));
                case 3 -> System.out.println(x + " * " + y + " = " + c.multiplicacao(x, y));
                case 4 -> System.out.println(x + " / " + y + " = " + c.divisao(x, y));
                case 5 -> System.out.println(x + " ^ " + y + " = " + c.exponenciacao(x, y));
            }
            System.out.println("Entre com o numero equivalente a operacao que deseja realizar (digite 0 para sair): ");
            System.out.print("1 - Soma, 2 - Subtracao, 3 - Multiplicacao, 4 - Divisao, 5 - Exponenciacao: ");
            op = in.nextInt();
        }
        System.out.println("Programa finalizado");
        in.close();
    }
}
