package br.unifor.poo.aulas.aula04;

import java.util.Scanner;

/**
 * Created by evertonguimaraes on 09/03/17.
 */
public class MainPlaneta {

    public static void main(String[] args) {

        TesteEnumPlaneta planeta = new TesteEnumPlaneta();

        planeta.testarEnumPlaneta(PlanetaEnum.MERCURIO);

        planeta.testarEnumPlaneta(PlanetaEnum.JUPITER);

        planeta.testarEnumPlaneta(PlanetaEnum.TERRA);

    }
}
