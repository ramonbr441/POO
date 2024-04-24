package ads.poo;

import java.util.ArrayList;

public class Livro {

    private String titulo;
    private Double preco;
    private ArrayList <Autor> autores;
    private String isbn;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public void setAutores(ArrayList<Autor> autores) {
        this.autores = autores;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Livro(String titulo, Double preco, ArrayList<Autor> autores, String isbn) {
        this.titulo = titulo;
        this.preco = preco;
        this.autores = autores;
        this.isbn = isbn;
    }

    public boolean addAutor(Autor a) {
        return this.autores.add(a);
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        for (Autor autor : this.autores) {

            sb.append(autor);
        }
        return String.format("ISBN: %s, TITULO: %s, PRECO: %d,autores:\n%s", isbn, titulo, preco,sb );
    }
}