public class Notebook extends Produto{
    private double armazenamento;
    private String gpu;
    private String processador;

    public void setArmazenamento(double armazenamento) {
        this.armazenamento = armazenamento;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    @Override
    public String etiquetaPreco(){
        System.out.print("\n"+ super.etiquetaPreco());
        String aux;
        aux = " - " + armazenamento + " - " + gpu + " " + processador;
        return aux;
    }
}
