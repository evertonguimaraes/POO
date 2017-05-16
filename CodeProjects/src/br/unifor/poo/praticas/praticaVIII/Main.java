package br.unifor.poo.praticas.praticaVIII;

/**
 * Created by evertonguimaraes on 16/05/17.
 */
public class Main {

    public static void main(String[] args) {

        Contribuinte [] listaContribuintes;

        listaContribuintes = Contribuinte.carregarListaContribuintes();

        System.out.printf("NOME                       IMPOSTO\n");
        System.out.printf("====================       =======\n\n");

        for(Contribuinte contribuinte : listaContribuintes) {
            System.out.printf(contribuinte.toString());
        }
    }
}
