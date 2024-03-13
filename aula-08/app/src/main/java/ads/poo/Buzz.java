package ads.poo;

import java.util.Random;

public class Buzz {


    private String aplicandoGolpe;
    private String disparolaser;
    private String[] frases = {"Isto não é voar. Isto é cair, com estilo!", "Ao infinito e além!" , "Nunca duvidei de mim mesmo, Comandante, e não vou começar agora!", "Embora você tenha tentado acabar comigo, a vingança não é um ideal que promovemos no meu planeta.", "É quase como diz Buzz Lightyear\n" +
            "Minha imaginação me leva ao infinito e ao além ", "Eu sou seu Buzz Lightyear\n" +
            "Vamo voar\n" +
            "Pra bem longe daqui\n" +
            "Ao infinito e além!" };
    private boolean abreCapcete = false;
    private boolean abreAsas = false;


// metodos
    public boolean isAbreCapcete(){
        return abreCapcete;
    }

    public boolean abrirFecharCapacete() {
        abreCapcete = !abreCapcete;
        return abreCapcete;

    }

    public boolean isAbreAsas() {
        abreAsas = !abreAsas;
        return abreAsas;
    }

    public String falarFrases() {
        Random r = new Random();
        return frases[r.nextInt(6)];

    }

    public String isAplicandoGolpe() {
        return "desferindo soco";
    }

    public String isDisparolaser() {

        return "disparando laser";
    }
}
