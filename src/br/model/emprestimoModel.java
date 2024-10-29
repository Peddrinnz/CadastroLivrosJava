package br.model;

import java.time.LocalDateTime;

public class EmprestimoModel {
    private UsuarioModel usuario;
    private LivroModel livro;
    private LocalDateTime dataEmprestimo;
    private LocalDateTime dataDevolucao;
    public EmprestimoModel(UsuarioModel usuario, LivroModel livro) {
        this.usuario = usuario;
        this.livro = livro;
        this.dataEmprestimo = LocalDateTime.now();
        this.dataDevolucao = null;
    }

    public UsuarioModel getUsuario() {
        return usuario;
    }
    public void setUsuario(UsuarioModel usuario) {
        this.usuario = usuario;
    }
    public LivroModel getLivro() {
        return livro;
    }
    public void setLivro(LivroModel livro) {
        this.livro = livro;
    }
    public LocalDateTime getDataEmprestimo() {
        return dataEmprestimo;
    }
    public LocalDateTime getDataDevolucao() {
        return dataDevolucao;
    }
    public void setDataDevolucao(LocalDateTime dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
}
