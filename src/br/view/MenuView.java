package br.view;

import javax.swing.*;

import br.controller.LivroController;
import br.model.LivroModel;

public class MenuView {
    int op;
    LivroView livroView = new LivroView();
    LivroController livroController = new LivroController();

    public void menuInicial() {
        do {
            String menu = "1) para cadastrar o livro \n" +
            "2) para cadastrar o usuario\n" +
            "3) para fazer um empréstimo\n" +
            "4) para registrar devoluções\n" +
            "5) Listar livros disponiveis\n" +
            "0) para Sair";
            
            op = Integer.parseInt(JOptionPane.showInputDialog(null, menu));

            switch (op) {
                case 1:
                    LivroModel livroModel = new LivroModel(null, null, 0, 0);
                    livroModel = livroView.coletarDados(livroModel);
                    String resultado = livroController.salvarLivro(livroModel);
                    JOptionPane.showMessageDialog(null, resultado);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Usuário cadastrado.");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Empréstimo realizado.");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Devolução registrada");
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Aqui está a listagem dos livros disponiveis:");
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    break;
                default:
                System.out.println("Número inválido");
            }
        } while (op != 0);
    }
}
