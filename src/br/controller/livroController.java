package br.controller;

import br.model.LivroModel;
import br.respository.LivroRepository;
import java.util.List;

public class LivroController{
    private static LivroRepository livroRepository = new LivroRepository();

    public String salvarLivro(LivroModel livro) {
        return livroRepository.salvar(livro);
    }

    public List<LivroModel> listarLivros() {
        return livroRepository.listarLivros();
    }
}