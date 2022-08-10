import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //classe para entrada de dados

        System.out.println("Digite 2 valores:");
        //valores que irão compor o cálculo
        double x = in.nextDouble();
        double y = in.nextDouble();

        System.out.println("Qual operacao deseja realizar?");
        System.out.print("A - adicao; S - subtracao; M - multiplicacao; D - divisao: ");
        in.nextLine(); //permite a entra da String depois dos números
        String aux = in.nextLine(); //string auxiliar para ler a opcao
        char op = aux.charAt(0); //salva a letra escolhida

        double res; //salva o resultado da operacao
        //switch-case para o calculo escolhido
        switch(op){
            case 'A':
                res = x + y;
                System.out.println(x+" + "+y+" = "+res);
                break;
            case 'S':
                res = x - y;
                System.out.println(x+" - "+y+" = "+res);
                break;
            case 'M':
                res = x * y;
                System.out.println(x+" * "+y+" = "+res);
                break;
            case 'D':
                res = x / y;
                System.out.println(x+" / "+y+" = "+res);
                break;
            default:
                System.out.println("Operacao invalida");
        }
        in.close();

    }
}
