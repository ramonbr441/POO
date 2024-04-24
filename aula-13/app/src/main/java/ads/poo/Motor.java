package ads.poo;

public class Motor {

    private int cilindrada;

    private int hp;

    public Motor(int hp, int cilindrada) {
        this.hp = hp;
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "cilindrada=" + cilindrada +
                ", hp=" + hp +
                '}';
    }
}
