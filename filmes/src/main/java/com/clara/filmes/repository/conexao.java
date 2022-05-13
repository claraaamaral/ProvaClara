package com.clara.filmes.repository;

import java.sql.Connection;
import java.sql.DriverManager;

public class conexao {
    private String caminho;
    private String usuario;
    private String senha;
    private Connection minhaConexao;

    public conexao(String string, String string2, String string3) {
    }

    public void Conexao (String c, String u, String s) {
        caminho = c;
        usuario = u;
        senha = s;
    }

    public void conectar () {
        try {
            Class.forName("org.postgresql.Driver");
            minhaConexao = DriverManager.getConnection(caminho, usuario, senha);
        }catch (Exception e) {
            System.out.println ("Erro na conexão: " + e.getMessage());
        }
    }

    public void desconectar() {
        try {
            minhaConexao.close ();
        }catch (Exception e) {
            System.out.println("Erro na desconexão: " + e.getMessage());
        }
    }

    public Connection getConexao() {
        return minhaConexao;
    }
}
