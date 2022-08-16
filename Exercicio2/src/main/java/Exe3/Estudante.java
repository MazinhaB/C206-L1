package Exe3;

public class Estudante {

    //Atributos
    String nome;
    int idade;
    InfosContato ic;

    //Metodos
    public void adicionarInfo(InfosContato ic){
        this.ic = ic;
    }
    public void estudar(int horas){
        System.out.println("Bo estudar "+horas+" horas");
    }
    public void mostraInfo(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        ic.mostraInfo();
    }
}
