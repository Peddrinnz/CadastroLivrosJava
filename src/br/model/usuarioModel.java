package br.model;

public class UsuarioModel {
    private String nomeUsuario;
    private String email;
    private int num_ID;
    
    public UsuarioModel(String nomeUsuario, String email, int num_ID) {
        this.nomeUsuario = nomeUsuario;
        this.email = email;
        this.num_ID = num_ID;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNum_ID() {
        return num_ID;
    }

    public void setNum_ID(int num_ID) {
        this.num_ID = num_ID;
    }
}