package br.unifor.poo.praticas.praticaIX;

/**
 * Created by evertonguimaraes on 16/05/17.
 */
public class PessoaFisica extends Contribuinte {

    protected String cpf;


    public PessoaFisica (String nomeContribuinte, double rendaBruta,String cpf) {
        nomeContribuinte = nomeContribuinte;
        rendaBruta = rendaBruta;
        cpf = cpf;
    }

    @Override
    public String toString() {
        return String.format("%-20s  %9.2f\n", nomeContribuinte, calcularImposto());
    }

    @Override
    public double calcularImposto() {
        if(rendaBruta < 1400.00)
            return 0.0;
        else{
            if(rendaBruta <= 2100.00) {
                return rendaBruta * 0.1 - 100.00;
            }else{
                if(rendaBruta <= 2800.00) {
                    return rendaBruta * 0.15 - 270.00;
                }else{
                    if(rendaBruta <= 3600.00){
                        return rendaBruta * 0.25 - 500.00;
                    }else{
                        return rendaBruta * 0.3 - 700.00;
                    }
                }
            }
        }
    }
}
