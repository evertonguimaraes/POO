package br.unifor.poo.aulas.aula08.exceptions.exemplos;

/**
 * Created by evertonguimaraes on 11/05/17.
 */
public class User {

    private String user;
    private String senha;

    public User(String user, String senha) {
        this.user = user;
        this.senha = senha;
    }

    public User() {
    }

    public String getNome() {
        return user;
    }

    public void setNome(String nome) {
        this.user = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s, CPF: %s %n", user, senha);
    }
}
