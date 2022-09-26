public class Main {
    public static void main(String[] args) {
        TerraMedia terraMedia = new TerraMedia();

        Arma a1 = new Arma();
        a1.setNomeArma("Clava");
        a1.setMagica(false);

        Arma a2 = new Arma();
        a2.setNomeArma("Rapieira");
        a2.setMagica(true);

        Arma a3 = new Arma();
        a3.setNomeArma("Espada Longa");
        a3.setMagica(true);

        Anao anao = new Anao();
        anao.setNome("Alton Prato Cheio");
        anao.setAltura(105);
        anao.setIdade(57);
        anao.setEnergia(500);
        anao.setReino("Novigrad");
        anao.arma = a1;
        terraMedia.addHabitante(anao);

        Elfo elfo = new Elfo();
        elfo.setNome("Caeldrim Amastacio");
        elfo.setEnergia(750);
        elfo.setIdade(158);
        elfo.setTribo("Clover");
        elfo.arma = a2;
        terraMedia.addHabitante(elfo);

        Mago mago = new Mago();
        mago.setNome("Aang Mirabel");
        mago.setEnergia(450);
        mago.setCor("Azul");
        mago.setIdade(200);
        mago.arma = a3;
        terraMedia.addHabitante(mago);

        terraMedia.listarHabitantes();
    }
}
