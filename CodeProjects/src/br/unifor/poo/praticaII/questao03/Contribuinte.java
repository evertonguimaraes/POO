package br.unifor.poo.praticaII.questao03;

/**
 * Created by evertonguimaraes on 04/03/17.
 */

public abstract class Contribuinte {

    protected String nome;
    protected double renda;

    // Metodo estático que gera uma lista de contribuintes
    // utilizando os subtipos PessoaFisica e PessoaJuridica

    public static Contribuinte[] gerarListaContribuintes(){

        Contribuinte [] listaContribuintes = new Contribuinte[10];

        listaContribuintes[0] = new PessoaFisica("Josefa", 3500.60, "069.345.234-43");
        listaContribuintes[1] = new PessoaJuridica("UNIFOR", 2500102.00, "21.245.432/0001-32");

        // TODO Crie outros objetos do tipo PessoaFisica e PessoaJuridica para preenchar a lista de contribuintes.

        return null;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getRenda() {
        return renda;
    }

    public void setRenda(String renda) {
        this.renda = renda;
    }

    // Assinatura do método abstrato que deve ser
    // implementado em ambas as classes com as
    // respectivas particularidades.
    public abstract double calcularImpostos();

}
