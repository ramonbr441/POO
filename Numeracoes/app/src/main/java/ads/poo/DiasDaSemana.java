package ads.poo;

public enum DiasDaSemana {

    DOM(0, "Domingo"),
    SEG(1,"Segunda-Feira"),
    TER(2,"Terça-Feira"),
    QUA(3,"Quarta-Feira"),
    QUI(4,"Quinta-Feira"),
    SEX(5,"Sexta-Feira"),
    SAB(6, "Sábado" );


    private int codigo;
    private String text;

    DiasDaSemana(int codigo, String text) {
        this.codigo = codigo;
        this.text = text;
    }

    @Override
    public String toString() {
        return "\n" + text;
    }

    public int getCodigo() {
        return codigo;
    }
}
