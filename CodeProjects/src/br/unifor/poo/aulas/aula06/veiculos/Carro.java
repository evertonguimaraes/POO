package br.unifor.poo.aulas.aula06.veiculos;

/**
 * Created by evertonguimaraes on 18/04/17.
 */


public class Carro extends Veiculo implements IUsaCombustivel{


    private TipoCombustivel tipo;
    private double capcTanque=50.00;
    private double totComb=20.00;

    public void dirigir(){

    };

    @Override
    public double abastecer(TipoCombustivel tipoCombustivel, double quantidade) {
        if(tipo != TipoCombustivel.ALCOOL &&
                tipo!= TipoCombustivel.GASOLINA)
            return quantidade;

        double faltaPreencher=capcTanque-totComb;

        if(quantidade>faltaPreencher) {
            totComb = capcTanque;
            return quantidade - faltaPreencher;
        }else{
            totComb += quantidade;
            return 0.0;
        }
    }

    @Override
    public void calibrarPneus() {

    }
}
