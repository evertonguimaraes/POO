package br.unifor.poo.aulas.aula07.collections.operations;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by evertonguimaraes on 02/05/17.
 */

public class SortOperations {

    public static void main(String[] args) {

        String naipes [] = {"Copas", "Ouros", "Espada", "Bastos"};

        List<String> listaNaipes = Arrays.asList(naipes);

        System.out.printf("Elementos não ordenados %s %n", listaNaipes);

        Collections.sort(listaNaipes);

        System.out.printf("Elementos ordenados %s %n", listaNaipes);

        Collections.sort(listaNaipes, Collections.reverseOrder());
        System.out.printf("Elementos ordem inversa %s %n", listaNaipes);
    }
}
