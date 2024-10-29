package br.view;

import javax.swing.*;

import br.controller.EmprestimoController;
import br.controller.LivroController;
import br.controller.UsuarioController;
import br.model.EmprestimoModel;
import br.model.LivroModel;
import br.model.UsuarioModel;

import java.util.List;

public class MenuView {
    int op;
    LivroView livroView = new LivroView();
    UsuarioView usuarioView = new UsuarioView();
    EmprestimoView emprestimoView = new EmprestimoView();
    LivroController livroController = new LivroController();
    UsuarioController usuarioController = new UsuarioController();
    EmprestimoController emprestimoController = new EmprestimoController();

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
                    String resultadoLivro = livroController.salvarLivro(livroModel);
                    JOptionPane.showMessageDialog(null, resultadoLivro);
                    break;
                case 2:
                    UsuarioModel usuarioModel = new UsuarioModel(null, null, 0);
                    usuarioModel = UsuarioView.coletarDadosUser(usuarioModel);
                    String resultadoUsuario = usuarioController.salvarUsuario(usuarioModel);
                    JOptionPane.showMessageDialog(null, resultadoUsuario);
                    break;
                case 3:
                    String tituloLivro = JOptionPane.showInputDialog(null, "Digite o título do livro para emprestar:");
                    LivroModel livroEmprestado = null;

                    for (LivroModel livro : livroController.listarLivros()) {
                        if (livro.getTitulo().equalsIgnoreCase(tituloLivro) && livro.getQtd_disponivel() > 0) {
                            livroEmprestado = livro;
                            break;
                        }
                    }

                    if (livroEmprestado != null) {
                        String nomeUsuario = JOptionPane.showInputDialog(null, "Digite o nome do usuário:");
                        UsuarioModel usuarioEmprestimo = usuarioController.listarUsuarios().stream()
                            .filter(u -> u.getNomeUsuario().equalsIgnoreCase(nomeUsuario))
                            .findFirst().orElse(null);

                            if (usuarioEmprestimo != null) {
                                EmprestimoModel novoEmprestimo = emprestimoView.coletarDados(usuarioEmprestimo, livroEmprestado);
                                String mensagemEmprestimo = emprestimoView.mostrarDataEmprestimo(novoEmprestimo);
                                JOptionPane.showMessageDialog(null, mensagemEmprestimo);
                                
                                livroEmprestado.setQtd_disponivel(livroEmprestado.getQtd_disponivel() - 1);
                            } else {
                                JOptionPane.showMessageDialog(null, "Usuário não encontrado.");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Livro não disponível para empréstimo.");
                    }
                    break;
                case 4:
                String nomeUsuarioDevolucao = JOptionPane.showInputDialog(null, "Digite o nome do usuário para devolução:");
                UsuarioModel usuarioDevolucao = usuarioController.listarUsuarios().stream()
                        .filter(u -> u.getNomeUsuario().equalsIgnoreCase(nomeUsuarioDevolucao))
                        .findFirst().orElse(null);
            
                if (usuarioDevolucao != null) {
                    String tituloLivroDevolucao = JOptionPane.showInputDialog(null, "Digite o título do livro que deseja devolver:");
                    EmprestimoModel emprestimoDevolucao = null;

                    List<EmprestimoModel> emprestimosAtivos = emprestimoController.listarEmprestimosAtivos();
                    for (EmprestimoModel emprestimo : emprestimosAtivos) {
                        if (emprestimo.getUsuario().equals(usuarioDevolucao) && emprestimo.getLivro().getTitulo().equalsIgnoreCase(tituloLivroDevolucao)) {
                            emprestimoDevolucao = emprestimo;
                            break;
                        }
                    }
            
                    if (emprestimoDevolucao != null) {
                        String resultadoDevolucao = emprestimoController.registrarDevolucao(emprestimoDevolucao);
                        JOptionPane.showMessageDialog(null, resultadoDevolucao);
                    } else {
                        JOptionPane.showMessageDialog(null, "Empréstimo não encontrado para o usuário e livro informados.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Usuário não encontrado.");
                }
                    break;
                case 5:
                    List<LivroModel> livros = livroController.listarLivros();
                    if (livros.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Não a livros disponiveis.");
                    } else {
                        StringBuilder listaLivros = new StringBuilder("Livros Disponiveis: \n");
                        for (LivroModel livro : livros) {
                            listaLivros.append("Título: ").append(livro.getTitulo())
                                    .append(", Autor: ").append(livro.getAutor())
                                    .append(", ISBN: ").append(livro.getIsbn())
                                    .append(", Quantidade: ").append(livro.getQtd_disponivel())
                                    .append("\n");
                        }
                        JOptionPane.showMessageDialog(null, listaLivros.toString());
                    }
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
