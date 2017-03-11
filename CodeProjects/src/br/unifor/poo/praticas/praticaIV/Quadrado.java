package br.unifor.poo.praticas.praticaIV;

/**
 * Created by evertonguimaraes on 11/03/17.
 */


public class Quadrado extends Retangulo{

    Quadrado(Ponto ponto1, Ponto ponto2, Ponto ponto3, Ponto ponto4) {
        super(ponto1, ponto2, ponto3, ponto4);
    }

    @Override
    public double calcularPerimetro(){
        // TODO Implementar seu codigo aqui.

        return 0;
    }

    @Override
    public double calcularArea(){
        // TODO Implementar seu codigo aqui.
        return 0;
    }

    @Override
    public String getTipo(){
        return "Quadrado";
    }
}



