package br.controller;

import br.model.EmprestimoModel;
import br.model.LivroModel;
import br.respository.EmprestimoRepository;
import java.util.List;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class EmprestimoController {
    private EmprestimoRepository emprestimoRepository = new EmprestimoRepository();

    public String salvarEmprestimo(EmprestimoModel emprestimo) {
        return emprestimoRepository.salvar(emprestimo);
    }

    public List<EmprestimoModel> listarEmprestimos() {
        return emprestimoRepository.listarEmprestimo();
    }

    public List<EmprestimoModel> listarEmprestimosAtivos() {
        List<EmprestimoModel> todosEmprestimos = emprestimoRepository.listarEmprestimo();
        
        return todosEmprestimos.stream()
                .filter(emprestimo -> emprestimo.getDataDevolucao() == null)
                .toList();
    }

    public String registrarDevolucao(EmprestimoModel emprestimo) {
        emprestimo.setDataDevolucao(LocalDateTime.now());

        LivroModel livro = emprestimo.getLivro();
        livro.setQtd_disponivel(livro.getQtd_disponivel() + 1);
        return "Devolução registradada com sucesso!\nData de devolução:" + emprestimo.getDataDevolucao().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
    }
}
