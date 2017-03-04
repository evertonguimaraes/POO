package br.unifor.poo.praticaII.questao04;

/**
 * Created by evertonguimaraes on 04/03/17.
 */


public class TestePoligono {

    public static void main(String[] args) {

        Container c=new Container(10);

        Poligono triangulo = new Triangulo();
        c.addPoligono(triangulo);

        Poligono retangulo = new Retangulo();
        c.addPoligono(retangulo);

        Poligono quadrado = new Quadrado();
        c.addPoligono(quadrado);

        // TODO continuar a lista com 10 polígonos.

        // TODO implementa o código para imprimir o
        // tipo de cada polígono
    }
}
