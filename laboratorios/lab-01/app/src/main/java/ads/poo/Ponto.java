package ads.poo;

public class Ponto {

    //atributos
    private int x;
    private int y;

    // metodos:

    //metdodo construtor
    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Ponto(){

    }

    //metdodos modificadores
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    //metodo to string


    @Override
    public String toString() {
        return "("+ x + "," + y + ")";
    }

    public double distanciaPontos(Ponto p) {
        double hx =  p.getX() - this.x;
        double jx =  p.getY() - this.y;
        return Math.sqrt(hx*hx + jx*jx);

    }


}
