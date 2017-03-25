package br.unifor.poo.praticas.praticaI.questao2;

/**
 * Created by evertonguimaraes on 25/03/17.
 */
public class SocioTest {

    public static void main(String[] args) {


        Socio socio1 = new Socio(123456);
        System.out.println(socio1.getMatricula());

        Socio socio2 =  new Socio("Everton",
                "Av Washington Soares",
                "21/03/1985",
                731545256);

        System.out.printf("Matricula Socio 1: %s %n", socio1.getMatricula());

        System.out.printf("Dados Socio 2: %s", socio2.toString());
    }
}
