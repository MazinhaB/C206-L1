import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);//classe para entrada de dados

        System.out.print("Entre com o valor da primeira nota: ");
        int NP1 = in.nextInt(); //leitura da primeira nota
        System.out.print("Entre com o valor da segunda nota: ");
        int NP2 = in.nextInt();
        int media = (NP1+NP2)/2; //calculo da media

        System.out.println("Media: " +media);
        in.close();

    }
}
