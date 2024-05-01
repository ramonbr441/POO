package ads.poo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Contato {

    private String nome;
    private String sobrenome;
    private LocalDate dataNasc;
    private ArrayList<Telefone> telefones;
    private ArrayList<Email> emails;

    public Contato(String nome, String sobrenome, LocalDate dataNasc) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNasc = dataNasc;
        this.telefones = new ArrayList<>();
        this.emails = new ArrayList<>();
    }

    public boolean addTelefone(String Rotulo, String valor){
        Telefone x = new Telefone(Rotulo,valor);
        return  this.telefones.add(x);
    }

    public boolean addEmail(String rotulo,String valor){
        Email y = new Email(rotulo, valor);
        return this.emails.add(y);
    }

    public boolean removeTelefone(String Rotulo){
        return telefones.removeIf(elemento -> elemento.getRotulo().equals(Rotulo));
    }

    public boolean removeEmail(String Rotulo) {
        return telefones.removeIf(elemento -> elemento.getRotulo().equals(Rotulo));
    }
}
