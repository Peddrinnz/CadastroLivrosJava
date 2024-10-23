package br.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Livro")
public class LivroModel {
    @Id
    @GeneratedValue
    private long id;
    private String titulo;
    private String autor;
    private int isbn;
    private int qtd_disponivel;

    public LivroModel(String titulo, String autor, int isbn, int qtd_disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.qtd_disponivel = qtd_disponivel;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getQtd_disponivel() {
        return qtd_disponivel;
    }

    public void setQtd_disponivel(int qtd_disponivel) {
        this.qtd_disponivel = qtd_disponivel;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
