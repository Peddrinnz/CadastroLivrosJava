package br.respository;

import br.model.EmprestimoModel;
import java.util.ArrayList;
import java.util.List;

public class EmprestimoRepository {
    private List<EmprestimoModel> emprestimos = new ArrayList<>();

    public String salvar(EmprestimoModel emprestimo) {
        if (emprestimo != null) {
            emprestimos.add(emprestimo);
            return "Empréstimo realizado com sucesso";
        }
        return "Erro ao realizar o empréstimo!";
    }

    public List<EmprestimoModel> listarEmprestimo() {
        return emprestimos;
    }
}
