package br.model;

import java.util.Date;

public class emprestimoModel {
    private usuarioModel usuario;
    private livroModel livro;
    private Date dataEmprestimo;
    private Date dataDevolucao;
    public emprestimoModel(usuarioModel usuario, livroModel livro, Date dataEmprestimo, Date dataDevolucao) {
        this.usuario = usuario;
        this.livro = livro;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public usuarioModel getUsuario() {
        return usuario;
    }
    public void setUsuario(usuarioModel usuario) {
        this.usuario = usuario;
    }
    public livroModel getLivro() {
        return livro;
    }
    public void setLivro(livroModel livro) {
        this.livro = livro;
    }
    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }
    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }
    public Date getDataDevolucao() {
        return dataDevolucao;
    }
    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
}
