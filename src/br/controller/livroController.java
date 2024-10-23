package br.controller;

import java.util.ArrayList;
import java.util.List;

import br.model.LivroModel;

public class LivroController {
    private List<LivroModel> livros = new ArrayList<>();

    // implementei a funcionalidade para ler o livro
    public void addLivro(LivroModel livro) {
        livros.add(livro);
    }

    // implementei a funcionalidade de listar os livros baseado se há livros > 0
    public List<LivroModel> listarLivrosDisponiveis() {
        List<LivroModel> livrosDisponiveis = new ArrayList<>();
        for (LivroModel livro : livros) {
            if (livro.getQtd_disponivel() > 0) {
                livrosDisponiveis.add(livro);
            }
        }
        return livrosDisponiveis;
    }

    // implementei a funcionalidade de remover um livro da lista
    public void removerLivro(LivroModel livro) {
        livros.remove(livro);
    }

    // implementei a funcionalide de atualizar o livro
    public void atualizarLivro(LivroModel livroAntigo, LivroModel livroNovo) {
        int index = livros.indexOf(livroAntigo);
        if (index != -1) {
            livros.set(index, livroNovo);
        }
    }

    // função para verificar se pode haver emprestimo de livros
    public boolean emprestimoLivro(LivroModel livro) {
        if (livro.getQtd_disponivel() > 0) {
            livro.setQtd_disponivel(livro.getQtd_disponivel() - 1);
            return true;
        }
        return false;
    }

    // função para registrar devolução de livro
    public void devolverLivro(LivroModel livro) {
        livro.setQtd_disponivel(livro.getQtd_disponivel() + 1);
    }
}