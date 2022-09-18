package inatel.C206_lab.questao2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double raio;
        Scanner in = new Scanner(System.in);
        int op;

        do {
            System.out.print("Digite o raio da esfera: ");
            raio = in.nextDouble();
            System.out.printf("Circunferencia da esfera de raio %.2fcm: %.2fcm\n", raio, Calculadora.circunferencia(raio));
            System.out.printf("Volume (em centimetros cubicos) da esfera de raio %.2f cm: %.2f\n", raio, Calculadora.volume(raio));
            System.out.println("Digite 1 se deseja calcular os parametros para outro raio ou digite 2 para sair");
            op = in.nextInt();
        }while(op == 1);
        System.out.println("Valor de PI com 2 casas decimais: "+Calculadora.pi);
        in.close();
    }
}
