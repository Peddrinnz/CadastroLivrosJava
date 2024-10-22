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
            "5)Listar livros disponiveis";
            
            Integer.parseInt(JOptionPane.showInputDialog(null, menu));

            switch (op) {
                case 1:
                    JOptionPane.showMessageDialog(null, "teste");
                    break;    
                default:
                System.out.println("Número inválido");
            }
        } while (op != 0);
    }
}