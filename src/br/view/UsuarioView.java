package br.view;

import javax.swing.*;

import br.model.UsuarioModel;
public class UsuarioView {
    public static UsuarioModel coletarDadosUser(UsuarioModel usuario) {
        usuario.setNomeUsuario(JOptionPane.showInputDialog(null, "Digite o nome do usuário: "));
        usuario.setEmail(JOptionPane.showInputDialog(null, "Digite o e-mail do usuário: "));
        
        int ID = 0;
        boolean validInput = false;
        while (!validInput) {
            try{
                ID = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero de ID"));
                validInput = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "ID deve ser um número inteiro. Tente novamente.");
            }
        }
        usuario.setNum_ID(ID);

        return usuario;
    }
}