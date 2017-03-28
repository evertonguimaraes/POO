package br.unifor.poo.aulas.aula05;

/**
 * Created by evertonguimaraes on 28/03/17.
 */
public class Professor extends Pessoa{

    private String titulacao;

    public Professor() {
    }

    public Professor(String nome, String titulacao) {
        this.titulacao = titulacao;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }
}
