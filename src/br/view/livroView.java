package br.view;

import javax.swing.*;

import br.model.LivroModel;
public class LivroView {
    public LivroModel coletarDados(LivroModel livro) {
        livro.setAutor(JOptionPane.showInputDialog(null,"Digite o nome do Autor"));
        livro.setTitulo(JOptionPane.showInputDialog(null,"Digite o Ti­tulo"));
        livro.setIsbn(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o ISBN")));
        livro.setQtd_disponivel(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de Exemplares:")));

        return livro;
    }
}