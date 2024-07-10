package ads.poo.produtos;

public class Dimensao {

        private double Altura;
        private double Largura;
        private double Profundidade;

    public Dimensao(double altura, double largura, double profundidade) {
        Altura = altura;
        Largura = largura;
        Profundidade = profundidade;
    }

    @Override
    public String toString() {
        return "Dimensao{" +
                "Altura=" + Altura +
                ", Largura=" + Largura +
                ", Profundidade=" + Profundidade +
                '}';
    }
}
