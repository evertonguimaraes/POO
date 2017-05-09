package br.unifor.poo.aulas.aula07.collections.types;

import java.util.*;

/**
 * Created by evertonguimaraes on 02/05/17.
 */

public class CollectionsList {

    public static void main(String[] args) {

        // Criando velor predefinido
        String cores [] = {"VERMELHO", "LARANJA", "AMARELO",
                "VERDE", "AZUL", "ANIL", "VIOLETA"};

        // Criando um objeto ArrayList por meio da classe Arrays
        List<String> listaCores = Arrays.asList(cores);

        // Criando um objeto ArrayList
        List<String> listaCoresRemovidas = new ArrayList<>();

        // Criando velor predefinido
        String coresRemovidas [] = {"LARANJA", "AMARELO", "VERDE", "AZUL"};

        // Populando o array
        for(String cor: cores){
            listaCoresRemovidas.add(cor);
        }

        // Imprimindo os elementos da lista
        for (int i = 0; i < listaCores.size(); i++) {
            // retorna o elemento no indice i.
            System.out.printf("Elemento: %s", listaCores.get(i));
        }

        removerCores(listaCores, listaCoresRemovidas);

        // Saida após remoção de cores
        System.out.println("Apos a chamada a função removerCores");
        for (String cor : listaCores) {
            System.out.printf("Elemento: %s", cor); // retorna o elemento no indice i.
        }
    }

    public static void removerCores(Collection<String> collection1,
                                    Collection<String> collection2){

        // Obtem o objeto iterator da collection1. para permitir a navegação no ArrayList
        Iterator<String> iterator = collection1.iterator();

        while (iterator.hasNext()){
            if (collection2.contains(iterator.next())){
                iterator.remove();
            }
        }
    }
}
