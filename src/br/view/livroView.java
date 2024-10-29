package br.view;

import javax.swing.*;

import br.model.LivroModel;
public class LivroView {
    public LivroModel coletarDados(LivroModel livro) {
        livro.setAutor(JOptionPane.showInputDialog(null,"Digite o nome do Autor"));
        livro.setTitulo(JOptionPane.showInputDialog(null,"Digite o Titulo"));

        int isbn = 0;
        boolean validInput = false;
        while(!validInput) {
            try{
                isbn = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o ISBN"));
                validInput = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "ISBN deve ser um número inteiro. Tente novamente.");
            }
        }
        livro.setIsbn(isbn);

        int quantidade = 0;
        validInput = false;
        while (!validInput) {
            try {
                quantidade = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a quantidade de Exemplares:"));
                validInput = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Quantidade deve ser um número inteiro. Tente novamente.");
            }
        }
        livro.setQtd_disponivel(quantidade);

        return livro;
    }
}