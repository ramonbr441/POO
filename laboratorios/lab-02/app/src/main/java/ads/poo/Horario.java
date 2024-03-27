package ads.poo;

public class Horario {

    private int hora;
    private int min;
    private int seg;

    private String [] vetorUnidades = {"zero","uma","duas", "três", "quatro", "cinco", "seis", "sete", "oito", "nove", "dez", "onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove", "vinte" };
    private String [] vetorDezenas = {"zero","um","dois","trinta", "quarenta", "cinquenta"};

    public String horarioExtenso (){
        return vetorUnidades[this.hora]+" horas " + vetorDezenas[this.min] +" minutos "+ vetorDezenas[this.seg] + " segundos ";


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



    @Override
    public String toString() {
        return hora + ":" + min + ":" + seg;
    }
}
