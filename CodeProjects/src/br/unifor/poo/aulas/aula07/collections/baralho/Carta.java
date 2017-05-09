package br.unifor.poo.aulas.aula07.collections.baralho;

/**
 * Created by evertonguimaraes on 02/05/17.
 */


public class Carta {

    public static Face face;

    public static Naipe naipe;

    public Carta(Face face, Naipe naipe) {
        this.face = face;
        this.naipe = naipe;
    }

    public Face getFace() {
        return face;
    }

    public Naipe getNaipe() {
        return naipe;
    }

    @Override
    public String toString() {
        return String.format("%s de %s", face, naipe);
    }
}
