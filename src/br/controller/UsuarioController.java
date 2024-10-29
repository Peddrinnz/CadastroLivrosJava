package br.controller;

import br.model.UsuarioModel;
import br.respository.UsuarioRepository;
import java.util.List;

public class UsuarioController {
    private UsuarioRepository usuarioRepository = new UsuarioRepository();

    public String salvarUsuario(UsuarioModel usuario) {
        return usuarioRepository.salvar(usuario);
    }

    public List<UsuarioModel> listarUsuarios() {
        return usuarioRepository.listarUsuarios();
    }
}
