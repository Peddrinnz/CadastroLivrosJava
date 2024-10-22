package br.respository;

import br.model.livroModel;
import java.util.ArrayList;
import java.util.List;

public class livroRepository {
    private List<livroModel> livros = new ArrayList<>();

    // implementei a funcionalidade para ler o livro
    public void addLivro(livroModel livro) {
        livros.add(livro);
    }

    // implementei a funcionalidade de listar os livros baseado se há livros > 0
    public List<livroModel> listarLivrosDisponiveis() {
        List<livroModel> livrosDisponiveis = new ArrayList<>();
        for (livroModel livro : livros) {
            if (livro.getQtd_disponivel() > 0) {
                livrosDisponiveis.add(livro);
            }
        }
        return livrosDisponiveis;
    }

    // implementei a funcionalidade de remover um livro da lista
    public void removerLivro(livroModel livro) {
        livros.remove(livro);
    }

    // implementei a funcionalide de atualizar o livro
    public void atualizarLivro(livroModel livroAntigo, livroModel livroNovo) {
        int index = livros.indexOf(livroAntigo);
        if (index != -1) {
            livros.set(index, livroNovo);
        }
    }

    // função para verificar se pode haver emprestimo de livros
    public boolean emprestimoLivro(livroModel livro) {
        if (livro.getQtd_disponivel() > 0) {
            livro.setQtd_disponivel(livro.getQtd_disponivel() - 1);
            return true;
        }
        return false;
    }

    // função para registrar devolução de livro
    public void devolverLivro(livroModel livro) {
        livro.setQtd_disponivel(livro.getQtd_disponivel() + 1);
    }
}