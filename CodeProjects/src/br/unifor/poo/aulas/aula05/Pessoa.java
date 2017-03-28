package br.unifor.poo.aulas.aula05;

/**
 * Created by evertonguimaraes on 28/03/17.
 */
public abstract class Pessoa {

    private String nome;
    private String telefone;
    private String endereco;
    private String email;
    private long matricula;
    private long cpf;

    public Pessoa() {
    }

    public Pessoa(String nome, String telefone, String endereco, String email, long matricula, long cpf) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.email = email;
        this.matricula = matricula;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }
}
