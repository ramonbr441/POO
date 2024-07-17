package ads.poo;

public class Aldeao extends Personagem{


    public Aldeao(int vida, int ataque, double velocidade) {
        super(vida, ataque, velocidade);
    }

    public String andar(){
        return  "aldeão " + super.andar();
    }


    public String atacar() {
        return "aldeão " + super.atacar();
    }

    @Override
    public String toString() {
        return "eu sou um aldeão,  " + super.toString();
    }
}
