package br.unifor.poo.aulas.aula08.exceptions.exemplos;

import java.util.Scanner;

/**
 * Created by evertonguimaraes on 11/05/17.
 */
public class Teste3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        User[] pessoas = new User[4];

        System.out.println("Cadastrando pessoas....");
        User pessoa = null;
        for (int i = 0; i < pessoas.length-1; i++) {
            System.out.printf("Pessoa %d %n", i+1);

            System.out.println("Informe o nome: ");
            String nome = input.nextLine();

            System.out.println("Informe o cpf.");
            String cpf = input.nextLine();

            pessoa = new User(nome, cpf);
            pessoas[i] = pessoa;
        }

        try {

            for (int i = 0; i < pessoas.length; i++) {
                System.out.printf(pessoas[i].toString());
            }
        }

        catch (NullPointerException npe){
            npe.printStackTrace();
            System.err.println(npe.getMessage());
            System.err.println(npe.getCause());
        }

        catch (Exception e){
            System.err.println("Um dos registros PESSOA não possui valor (NULL)");
            e.getMessage();
        }

        finally {
            System.out.println("Finalizando o Scanner...");
            input.close();
        }
    }
}
