package br.unifor.poo.aulas.aula07.collections.operations;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by evertonguimaraes on 02/05/17.
 */
public class BinarySearchOperations {

    public static void main(String[] args) {

        String cores [] = {"VERMELHO", "LARANJA", "AMARELO",
                "VERDE", "AZUL", "ANIL", "VIOLETA"};

        List<String> listaCores = Arrays.asList(cores);

        Collections.sort(listaCores);

        System.out.printf("Lista Ordenada: %s %n", listaCores);

        // Pesquisa de valores na lista.
        printResultadoPesquisa(listaCores, "VERMELHO");
        printResultadoPesquisa(listaCores, "VIOLETA");
        printResultadoPesquisa(listaCores, "AZUL");
        printResultadoPesquisa(listaCores, "VERDE");
        printResultadoPesquisa(listaCores, "AMARELO");
    }

    private static void printResultadoPesquisa(List<String> list, String chave){

        int resultado = 0;

        resultado = Collections.binarySearch(list, chave);

        if (resultado >= 0){
            System.out.printf("Elementos encontrado no indice: %d %n", resultado);
        }else{
            System.out.printf("Nao encontrado (%d) %n", -1);
        }
    }
}
