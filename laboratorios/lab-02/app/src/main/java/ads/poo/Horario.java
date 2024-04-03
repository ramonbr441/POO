package ads.poo;

public class Horario {

    private int hora;
    private int min;
    private int seg;



    public String horarioExtenso (){

        String [] vetorHora = {"zero","uma","duas", "três", "quatro", "cinco", "seis", "sete", "oito", "nove", "dez", "onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove", "vinte" };
        String [] vetorMin = {"zero","um","dois","trinta", "quarenta", "cinquenta"};
       StringBuilder sb = new StringBuilder();
       sb.append(vetorHora[this.hora]);
       sb.append("hora(s)");
       sb.append((vetorMin[this.min]));
       sb.append("minuto(s)");

        return sb.toString();

    }
    public Horario(int hora, int min, int seg){
        if(hora<=23 && hora >= 0 && min <= 59 && min >= 0 && seg <= 59 && seg >= 0) {

            this.hora = hora;
            this.min = min;
            this.seg = seg;
        }else{
            this.hora = 0;
            this.min = 0;
            this.seg = 0;

        }
    }

    public Horario(int hora, int min){
        this(hora,min,0);

    }
    public Horario(int hora){
        this(hora,0 ,0 );
    }

    public Horario() {
        this(0,0,0);
    }
    public boolean setHora(int hora) {
        if(hora<= 23 && hora >= 0){
            this.hora = hora;
            return true;
        }else{
            return false;
        }
    }

    public boolean setMin(int min) {
        if(min<= 59 && min >= 0){
            this.min = min;
            return true;
        }else{
            return false;
        }
    }

    public boolean setSeg(int seg) {
        if(seg<= 59 && seg >= 0){
            this.seg = seg;
            return true;
        }else{
            return false;
        }
    }

    public int emSegundos(){
        return this.seg + this.min * 60 + this.hora * 60 *60;
    }

    public int difrenca(Horario outro){
        return  Math.abs(this.emSegundos() - outro.emSegundos());
    }



    @Override
    public String toString() {
        return hora + ":" + min + ":" + seg;
    }
}
