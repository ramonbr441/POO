package ads.poo.produtos;

public class Celular extends SemFio{

    private String SistemaOperacional;


    public Celular(int codigo, String numSerie, String modelo, double peso, Dimensao dim, float frequencia, int canais, float distancia, String sistemaOperacional) {
        super(codigo, numSerie, modelo, peso, dim, frequencia, canais, distancia);
        SistemaOperacional = sistemaOperacional;
    }

    public String getSistemaOperacional() {
        return SistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        SistemaOperacional = sistemaOperacional;
    }

    @Override
    public String imprimirDados() {
        return super.imprimirDados() + " : " + SistemaOperacional;
    }
}
