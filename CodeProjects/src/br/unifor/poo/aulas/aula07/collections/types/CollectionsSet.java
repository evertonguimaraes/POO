package br.unifor.poo.aulas.aula07.collections.types;

import java.util.*;

/**
 * Created by evertonguimaraes on 02/05/17.
 */
public class CollectionsSet {

    public static void main(String[] args) {

        // Pode ser implementado com HashSet ou TreeSet
        String nomes [] = {"Fulano", "Beltrano", "Ciclano", "Benzeno", "Alcino", "Beltrano", "Fulano"};


        // TODO Implementação com Set
        List<String> listaNomes = Arrays.asList(nomes);

        // Eliminando duplicatas da lista
        Set<String> hashNomes = new HashSet<>(listaNomes);

        // Imprimindo valores não duplicados.
        for (String nome : hashNomes){
            System.out.printf("%s ", nome);
        }


        // TODO Implementação com SortedSet e TreeSet
        SortedSet<String> sortedSet = new TreeSet<>(Arrays.asList(nomes));

        System.out.println("Ordenado");

        // TODO headSet
        // Obter um subconjunto do TreeSet em cada em que cada elemento
        // for menor que o elemento passado como parâmetro
        System.out.println("HeadSet - Ciclano");

        // TODO tailSet
        // Obter um subconjunto do TreeSet em cada em que cada elemento
        // for maior ou igual que o elemento passado como parâmetro
        System.out.println("HeadSet - Alcino");

        // TODO first - obtem o menor elemento do conjunto

        // TODO last - obtem o mairo elemento do conjunto
    }

    private static void printSet (SortedSet<String> sortedSet){
        for (String s: sortedSet) {
            System.out.printf("%s ", s);
        }
    }
}
