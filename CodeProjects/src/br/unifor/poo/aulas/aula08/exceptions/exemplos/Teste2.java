package br.unifor.poo.aulas.aula08.exceptions.exemplos;

import java.util.Scanner;

/**
 * Created by evertonguimaraes on 11/05/17.
 */
public class Teste2 {

    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);

        try{
            String [] frases = new String[4];

            for (int i = 0; i <= frases.length ; i++) {
                System.out.printf("elemento[%d]: ", i);
                frases[i] = input.nextLine();
            }

        } catch (Exception e){
            // O tratamento consiste em exibir uma nova mensagem.
            System.out.println("Voce esta acessando um indice do vetor que nao existe.");

            // O tratamento consiste em exibir uma nova mensagem.
            // Dispara novamente a ocorrência da exceção com uma mensagem diferente.
            // throw new ArrayIndexOutOfBoundsException("Voce esta acessando um indice do vetor que nao existe.");
        }





    }
}
