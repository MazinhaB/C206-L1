package inatel.C206_lab.questao1;

public class Conta {
    private double saldo; // saldo disponível na conta
    private static int qtdClientes; // quantidade de clientes cadastrados
    Cliente cliente;

    public static int getQtdClientes() {
        return qtdClientes;
    }
    public Conta(){ // conta a quantidade de clientes a cada Conta nova criada
        qtdClientes++;
    }
    public void setSaldo(double saldo) { // seta o saldo da conta
        this.saldo = saldo;
    }
    public void deposita(double valor){ // deposita um valor na conta
        this.saldo += valor;
    }
    public void saca(double valor){ // saca, se disponível, um valor da conta
        if(this.saldo >= valor){
            this.saldo -= valor;
            System.out.println("Operacao concluida");
        }
        else
            System.out.println("Saldo disponível insuficiente");
    }
    public void extrato(){ // mostra o saldo disponível
        System.out.printf("O saldo disponivel eh de: R$ %.2f\n", this.saldo);
    }
}
