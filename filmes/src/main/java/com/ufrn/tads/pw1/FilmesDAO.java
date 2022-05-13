package com.ufrn.tads.pw1;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FilmesDAO {

    public List<Filmes> listarFilmes() {
        Connection connection = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Filmes> listaDeFilmes = new ArrayList<>();
        try {
            connection = ConectaBanco.getConnection();
            stmt = connection.prepareStatement("select * from filme");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Filmes f = new Filmes();
                f.setId(rs.getInt("id"));
                f.setNome(rs.getString("nome"));
                f.setDuracao(rs.getString("duracao"));
                f.setAtores(rs.getFloat("atores"));
                f.setGeneros(rs.getFloat("generos"));
                f.setCartaz(rs.getFloat("cartaz"));
                listaDeFilmes.add(f);
            }
            connection.close();
        } catch (SQLException ignored) {
        }

        return listaDeFilmes;
    }

    public List<Filmes> listarFilmesPorId(int id) {

        Connection connection = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Filmes> listaDeFilmes = new ArrayList<>();

        try {
            connection = ConectaBanco.getConnection();
            stmt = connection.prepareStatement("select * from filmes where id=?");
            stmt.setInt(1, id);
            rs = stmt.executeQuery();
            if (rs.next()) {
                Filmes f = new Filmes();
                f.setId(rs.getInt("id"));
                f.setNome(rs.getString("nome"));
                f.setDuracao(rs.getString("duracao"));
                f.setAtores(rs.getFloat("atores"));
                f.setGeneros(rs.getFloat("generos"));
                f.setCartaz(rs.getFloat("cartaz"));
                listaDeFilmes.add(f);
            }
            connection.close();
        } catch (SQLException ignored) {
        }
        return listaDeFilmes;
    }

    public void cadastrarFilmes(Filmes f) {
        Connection connection = null;
        PreparedStatement stmt = null;

        try {
            connection = ConectaBanco.getConnection();

            stmt = connection.prepareStatement(
                    "insert into produto (nome, descricao, preco) values (?,?,?)");

            stmt.setString(1, f.getNome());
            stmt.setString(2, f.getDuracao());
            stmt.setFloat(3, f.getAtores());
            stmt.setFloat(4, f.getGeneros());
            stmt.setFloat(5, f.getCartaz());
            stmt.executeUpdate();
            connection.close();

        } catch (SQLException ex) {
           
        }
    }
}