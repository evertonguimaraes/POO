package br.unifor.poo.aulas.aula07.collections.autoboxing;

import java.util.Arrays;
import java.util.List;

/**
 * Created by evertonguimaraes on 02/05/17.
 */


public class Autoboxing {

    public static void main(String[] args) {

        // Criação de um vetor de Integers
        Integer arrayInteger [] = new Integer[10];

        // auto-boxing (atribui-se um tipo primitivo para um Objeto.
        // Permite dessa forma implementar as operações que estendem de Object
        arrayInteger[0] = 5;

        // auto-unboxing (atribui o valor de um objeto a um tipo primitivo).
        int value = arrayInteger[0];

        Double a = 5.6;
        double b = 5.3;

        Double x = a + b;
        System.out.printf("Operacao: %.2f %n", x);

        Double arrayDouble [] = new Double[4];
        arrayDouble[0] = 8.7;
        arrayDouble[1] = 6.5;
        arrayDouble[2] = 7.4;
        arrayDouble[3] = 7.8;

        List<Double> listDouble = Arrays.asList(arrayDouble);

        for (Double d: listDouble){
            System.out.printf("arrayDouble: %s %n", d.toString());
        }
    }
}
