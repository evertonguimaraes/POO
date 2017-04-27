package br.unifor.poo.aulas.aula06.veiculos;

/**
 * Created by evertonguimaraes on 18/04/17.
 */


public class Aviao extends Veiculo implements IUsaCombustivel{

    private TipoCombustivel tipo;
    private double capcTanque=5000.00;
    private double totComb=2000.00;

    public void aterrisar(){

    }

    @Override
    public void calibrarPneus() {

    }

    @Override
    public double abastecer(TipoCombustivel tipoCombustivel, double quantidade) {

        if(tipo != TipoCombustivel.QUEROSENE)
            return quantidade;

        double faltaPreencher =capcTanque - totComb;

        if(quantidade > faltaPreencher){
            totComb = capcTanque;
            return quantidade - faltaPreencher;
        }else{
            totComb += quantidade;
            return 0.0;
        }
    }
}
