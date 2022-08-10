import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double litroAlcool = 4.90;
        double litroGasolina = 6.00;
        double total = 0;
        System.out.print("Entre com a opcao de combustivel (A - alcool ou G - gasolina): ");
        String aux = in.nextLine();
        char op = aux.charAt(0);

        switch(op){
            case 'A':
                System.out.print("Entre com a quantidade de litros de alcool vendidos: ");
                double qtdAlcool = in.nextDouble();
                if(qtdAlcool <= 20)
                    total = qtdAlcool*litroAlcool*0.96;
                else
                    total = qtdAlcool*litroAlcool*0.94;
                break;
            case 'G':
                System.out.print("Entre com a quantidade de litros de gasolina vendidos: ");
                double qtdGasolina = in.nextDouble();
                if(qtdGasolina <= 20)
                    total = qtdGasolina*litroGasolina*0.97;
                else
                    total = qtdGasolina*litroGasolina*0.95;
                break;
            default:
                System.out.println("A opcao selecionada eh invalida");
        }
        System.out.println("O valor total do abastecimento eh de R$" +(total));
        in.close();
    }
}
