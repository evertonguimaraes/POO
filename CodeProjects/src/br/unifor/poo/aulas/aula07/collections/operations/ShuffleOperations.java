package br.unifor.poo.aulas.aula07.collections.operations;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by evertonguimaraes on 02/05/17.
 */
public class ShuffleOperations {

    public static void main(String[] args) {

        Double marks [] = {8.5, 9.8, 4.5, 7.4, 9.3};

        List<Double> markList = Arrays.asList(marks);

        System.out.printf("Elementos não ordenados %s %n", markList);

        Collections.sort(markList);
        System.out.printf("Elementos ordenados %s %n", markList);

        Collections.shuffle(markList);
        System.out.printf("Elementos embaralhados %s %n", markList);

        Collections.sort(markList, Collections.reverseOrder());
        System.out.printf("Elementos ordenados inversamente %s %n", markList);
    }
}
