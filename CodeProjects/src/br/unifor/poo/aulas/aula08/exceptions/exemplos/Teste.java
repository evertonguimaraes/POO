package br.unifor.poo.aulas.aula08.exceptions.exemplos;

import java.util.MissingFormatArgumentException;
import java.util.Scanner;

/**
 * Created by evertonguimaraes on 11/05/17.
 */
public class Teste {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try{
            String frases [] = new String[5];

            for (int i = 0; i < frases.length; i++) {
                System.out.printf("frases[%d]: %n",i);
                frases[i] = input.nextLine();
            }
        }catch (MissingFormatArgumentException mfae){
            System.err.printf("Nao foi informado a variavel no printf.");
        }
        catch(ArrayIndexOutOfBoundsException aiob){
            System.err.printf("Você esta acessando um indice fora dos limites do vetor.");
        }
    }
}
