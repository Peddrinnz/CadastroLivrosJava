package br.view;

import javax.swing.*;

public class livroView {
    int op;

    public void menuInicial() {
        do {
            String menu = "1) para cadastrar o livro \n" +
            "2) para cadastrar o usuario\n" +
            "3) para fazer um empréstimo\n" +
            "4) para registrar devoluções\n" +
            "5) Listar livros disponiveis\n" +
            "0) para Sair";
            
            Integer.parseInt(JOptionPane.showInputDialog(null, menu));

            switch (op) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Livro cadastrado.");
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