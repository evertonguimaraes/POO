package br.unifor.poo.praticas.praticaIX;

/**
 * Created by evertonguimaraes on 16/05/17.
 */
public class PessoaJuridica extends Contribuinte {

    protected String cnpj;

    public PessoaJuridica(String nomeContribuinte,double rendaBruta,String cnpj)
    {
        nomeContribuinte = nomeContribuinte;
        rendaBruta = rendaBruta;
        cnpj = cnpj;
    }

    @Override
    public String toString() {
        return String.format("%-20s  %9.2f\n", nomeContribuinte, calcularImposto());
    }

    @Override
    public double calcularImposto() {
        return rendaBruta * 0.1;
    }
}
