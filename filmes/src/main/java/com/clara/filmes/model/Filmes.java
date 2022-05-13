package com.clara.filmes.model;

public class Filmes {
    private Integer idFilmes;
    private String nome;
    private String duracao;
    private String atores;
    private String generos;
    private String cartaz;
    

    public Filmes(){

    }

    public Filmes(String nome, String duracao, String atores, String generos, String cartaz) {

        this.nome = nome;
        this.duracao = duracao;
        this.atores = atores;
        this.generos = generos;
        this.cartaz = cartaz;
    }

    public Filmes(Integer idfilmes, String nome, String duracao, String atores, String generos, String cartaz) {
        this.idFilmes= idfilmes;
        this.nome = nome;
        this.duracao = duracao;
        this.atores = atores;
        this.generos = generos;
        this.cartaz = cartaz;
    }

    @Override
    public String toString() {
        return "Filmes{" +
                "idfilmes=" + idFilmes +
                ", nome='" + nome + '\'' +
                ", duracao='" + duracao + '\'' +
                ", atores='" + atores + '\'' +
                ", generos='" + generos + '\'' +
                ", cartaz='" + cartaz + '\'' +
                '}';
    }

    public Integer getIdFilmes() {
        return idFilmes;
    }

    public void setIdFilmes(Integer idFilmes) {
        this.idFilmes= idFilmes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getAtores() {
        return atores;
    }

    public void setAtores(String atores) {
        this.atores = atores;
    }

    public String getGeneros() {
        return generos;
    }

    public void setGeneros(String generos) {
        this.generos = generos;
    }

    public String getCartaz() {
        return cartaz;
    }

    public void setCartaz(String cartaz) {
        this.cartaz = cartaz;
    }

}