package br.unifor.poo.aulas.aula04;

/**
 * Created by evertonguimaraes on 09/03/17.
 */
public class TesteEnumPlaneta {

    protected PlanetaEnum planetas;

    private double massa = 90;

    public void testarEnumPlaneta(PlanetaEnum planetaEnum){

        planetas =  planetaEnum;

        switch (planetas){

            case MERCURIO: // TODO;
                System.out.print(planetas.ordinal()+" - ");
                System.out.println("MERCURIO");
                System.out.println("Gravidade na Superficie: "+planetas.getGravidadeSuperficie());
                System.out.println("Peso na Superficie: "+planetas.getPesoSuperficie(90));
                break;

            case VENUS: // TODO;
                System.out.print(planetas.ordinal()+" - ");
                System.out.println("VENUS");
                System.out.println("Gravidade na Superficie: "+planetas.getGravidadeSuperficie());
                System.out.println("Peso na Superficie: "+planetas.getPesoSuperficie(90));
                break;

            case TERRA: // TODO;
                System.out.print(planetas.ordinal()+" - ");
                System.out.println("TERRA");
                System.out.println("Gravidade na Superficie: "+planetas.getGravidadeSuperficie());
                System.out.println("Peso na Superficie: "+planetas.getPesoSuperficie(90));
                break;

            case MARTE: // TODO;
                System.out.print(planetas.ordinal()+" - ");
                System.out.println("MARTE");
                System.out.println("Gravidade na Superficie: "+planetas.getGravidadeSuperficie());
                System.out.println("Peso na Superficie: "+planetas.getPesoSuperficie(90));
                break;

            case JUPITER: // TODO;
                System.out.print(planetas.ordinal()+" - ");
                System.out.println("JUPITER");
                System.out.println("Gravidade na Superficie: "+planetas.getGravidadeSuperficie());
                System.out.println("Peso na Superficie: "+planetas.getPesoSuperficie(90));
                break;

            case SATURNO: // TODO;
                System.out.print(planetas.ordinal()+" - ");
                System.out.println("SATURNO");
                System.out.println("Gravidade na Superficie: "+planetas.getGravidadeSuperficie());
                System.out.println("Peso na Superficie: "+planetas.getPesoSuperficie(90));
                break;

            case URANO: // TODO;
                System.out.println("URANO");
                System.out.println("Gravidade na Superficie: "+planetas.getGravidadeSuperficie());
                System.out.println("Peso na Superficie: "+planetas.getPesoSuperficie(90));
                break;

            case NETURNO: // TODO;
                System.out.print(planetas.ordinal()+" - ");
                System.out.println("NETURNO");
                System.out.println("Gravidade na Superficie: "+planetas.getGravidadeSuperficie());
                System.out.println("Peso na Superficie: "+planetas.getPesoSuperficie(90));
                break;
        }

    }

}
