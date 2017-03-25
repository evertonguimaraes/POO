package br.unifor.poo.praticas.praticaI.questao2;

/**
 * Created by evertonguimaraes on 25/03/17.
 */
public class Socio {

    private String nome;
    private String endereco;
    private String dataNascimento;
    private int matricula;

    public Socio(int matricula) {
        this.matricula = matricula;
    }

    public Socio(String nome, String endereco, String dataNascimento, int matricula) {
        this.nome = nome;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
        this.matricula = matricula;
    }

    // Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    /* O método getMatricula() deve retornar a matrícula do sócio como uma String formatada (12345-6).
      Use o operador % (resto da divisão) para desmembrar os caracteres numéricos que compõem a matrícula
      e o método Integer.toString(x) para converter de int para String.
    */
    public String getMatricula() {
        return String.format("%s-%s ",
                Integer.toString(matricula / 10),
                Integer.toString(matricula % 10));
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s, %s %n",
                getNome(),
                getEndereco(),
                getDataNascimento(),
                getMatricula());
    }
}
