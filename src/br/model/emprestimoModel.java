package br.model;

import java.util.Date;

public class EmprestimoModel {
    private UsuarioModel usuario;
    private LivroModel livro;
    private Date dataEmprestimo;
    private Date dataDevolucao;
    public EmprestimoModel(UsuarioModel usuario, LivroModel livro, Date dataEmprestimo, Date dataDevolucao) {
        this.usuario = usuario;
        this.livro = livro;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
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
