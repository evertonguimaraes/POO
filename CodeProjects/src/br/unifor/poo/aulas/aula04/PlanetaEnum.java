package br.unifor.poo.aulas.aula04;

/**
 * Created by evertonguimaraes on 07/03/17.
 */
public enum PlanetaEnum {

    MERCURIO (3.303e+23, 2.4397e6),
    VENUS (4.869e+24, 6.0518e6),
    TERRA (5.976e+24, 6.37814e6),
    MARTE (6.421e+23, 3.3972e6),
    JUPITER (1.9e+27,   7.1492e7),
    SATURNO (5.688e+26, 6.0268e7),
    URANO (8.686e+25, 2.5559e7),
    NETURNO (1.024e+26, 2.4746e7);

    private final double massa; // (em kg)

    private final double raio; // (em metros)

    PlanetaEnum(double massa, double raio) {
        this.massa = massa;
        this.raio = raio;
    }

    // constante gravitacional universal
    public static final double G = 6.67300E-11;

    private double getMassa() {

        return massa;
    }

    private double getRaio() {

        return raio;
    }

    double getGravidadeSuperficie() {
        return G * massa / (raio * raio);

    }

    double getPesoSuperficie(double massa) {

        return massa * getGravidadeSuperficie();
    }

}
