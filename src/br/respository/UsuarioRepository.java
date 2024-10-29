package br.respository;

import br.model.UsuarioModel;

import java.util.List;
import java.util.ArrayList;

public class UsuarioRepository {
    private List<UsuarioModel> usuarios = new ArrayList<>();

    public String salvar(UsuarioModel usuario) {
        if (usuario != null) {
            usuarios.add(usuario);
            return "Usuario salvo com sucesso";
        }
        return "Erro ao salvar o usuario";
    }

    public List<UsuarioModel> listarUsuarios() {
        return usuarios;
    }
}
