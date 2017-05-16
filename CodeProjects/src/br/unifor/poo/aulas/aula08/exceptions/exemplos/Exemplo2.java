package br.unifor.poo.aulas.aula08.exceptions.exemplos;

import br.unifor.poo.aulas.aula08.exceptions.creating.NovaException;

/**
 * Created by evertonguimaraes on 11/05/17.
 */
public class Exemplo2 {

    public static void main(String[] args) {

        try{
            // TODO Your code is here

            new Exception("Ocorreu uma nova exceção");

            throw new NovaException("Ocorreu uma nova exceção");

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}


