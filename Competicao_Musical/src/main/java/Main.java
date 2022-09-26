import jdk.jshell.ImportSnippet;

public class Main {
    public static void main(String[] args) {
        Cellista cellista = new Cellista();
        cellista.setNome("Carlos");
        cellista.setSentado(true);
        cellista.setIdade(45);
        cellista.setMusica("Carmina Burana");
        cellista.setPontuacao(120);

        Instrumento i1 = new Instrumento();
        i1.setModelo("Yamaha");
        i1.setCor("Preto");
        i1.setAno(2022);

        cellista.instrumento = i1;

        Pianista pianista = new Pianista();
        pianista.setNome("Beatriz");
        pianista.setIdade(29);
        pianista.setMusica("Dancing Queen");
        pianista.setPontuacao(105);
        pianista.setAlturaBanco(50);

        Instrumento i2 = new Instrumento();
        i2.setModelo("Essenfelder");
        i2.setCor("Bege");
        i2.setAno(2019);

        pianista.instrumento = i2;

        Violinista violinista = new Violinista();
        violinista.setNome("Bernardo");
        violinista.setIdade(38);
        violinista.setMusica("Musica do Titanic");
        violinista.setPontuacao(98);
        violinista.setMarcaBreu("Paganini");
        violinista.setUsaEspaleira(true);

        Instrumento i3 = new Instrumento();
        i3.setModelo("Stradivarius");
        i3.setCor("Branco");
        i3.setAno(2021);

        violinista.instrumento = i3;

        Competicao competicao = new Competicao();
        competicao.addMusico(cellista);
        competicao.addMusico(pianista);
        competicao.addMusico(violinista);

        competicao.listarCompetidores();

    }
}
