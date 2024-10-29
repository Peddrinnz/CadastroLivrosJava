package br.respository;

import br.model.LivroModel;
import java.util.ArrayList;
import java.util.List;

public class LivroRepository {
    private List<LivroModel> livros = new ArrayList<>();

    public String salvar(LivroModel livro) {
        if (livro != null) {
            livros.add(livro);
            return "Livro salvo com sucesso";
        }
        return "Erro ao salvar o livro";
    }

    public List<LivroModel> listarLivros() {
        return livros; 
    }
}
 