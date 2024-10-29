package br.view;

import javax.swing.*;

import br.model.UsuarioModel;

public class UsuarioView {
    public UsuarioModel coletarDadosUser(UsuarioModel usuario) {
        usuario.setNomeUsuario(JOptionPane.showInputDialog(null, "Digite o nome do usuário: "));
        usuario.setEmail(JOptionPane.showInputDialog(null, "Digite o e-mail do usuário: "));
        usuario.setNum_ID(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero de ID")));

        return usuario;
    }
}