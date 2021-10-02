package modelo;

import java.util.Objects;

public class Livro {

    private String titulo;

    private String autor;

    private int anodePublicacao;
    
    private int quantLivrosUnitario;

    public Livro(String titulo, String autor, int anoDePublicacao) {

        this.titulo = titulo;

        this.autor = autor;

        this.anodePublicacao = anoDePublicacao;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public int getAnoDePublicacao() {
        return this.anodePublicacao;
    }
    public int getQuantLivros() {
    	return this.quantLivrosUnitario;
    }

    public void setLivrosUnitario(int quantidade) {
       
        
        this.quantLivrosUnitario += quantidade;
    }
} 

