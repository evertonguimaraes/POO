package br.unifor.poo.praticas.praticaV;

import java.util.Date;

/**
 * Created by evertonguimaraes on 16/03/17.
 */
public class PagamentoCartaoCredito extends Pagamento{


    String numero;
    Date dataValidade;

    public PagamentoCartaoCredito(){
        super();
    }

    public PagamentoCartaoCredito(String numero, Date dataValidade){
        this.numero = numero;
        this.dataValidade = dataValidade;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

}
