package ads.poo;


public class Carro {

    private int velocidade;


    public Carro(int velocidade) {
        velocidade = Math.min(200, velocidade);
        velocidade = Math.max(0, velocidade );
        this.velocidade = velocidade;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public Carro(){
        this(100);
    }

    public int frear(int f) {
        velocidade = Math.max(0, velocidade -f);
        velocidade = Math.min(200, velocidade + f);
        return velocidade;
    }

    public int acelerar(int ac){
        velocidade = Math.min(200, velocidade + ac);
        velocidade = Math.max(0, velocidade -ac);

        return velocidade;
    }
}




