package br.view;

import br.model.EmprestimoModel;
import br.model.LivroModel;
import br.model.UsuarioModel;

import java.time.format.DateTimeFormatter;

public class EmprestimoView {
    public EmprestimoModel coletarDados(UsuarioModel usuario, LivroModel livro) {
        return new EmprestimoModel(usuario, livro);
    }

    public String mostrarDataEmprestimo(EmprestimoModel emprestimo) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String dataEmprestimo = emprestimo.getDataEmprestimo().format(formatter);
        return "Empréstimo realizado com sucesso\nData de Empréstimo: " + dataEmprestimo;
    }
}
