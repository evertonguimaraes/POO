package br.unifor.poo.aulas.aula06.comparable;

import java.util.Arrays;

/**
 * Created by evertonguimaraes on 18/04/17.
 */
public class Main {

    public static void main(String[] args) {

        Empregado[] listaEmpregados = {
                new Empregado("Joao",50.0),
                new Empregado("Ana",30.0),
                new Empregado("Paula",100.0),
                new Empregado("Carlos",10.0)};

        // foreach
        for(Empregado empregado:listaEmpregados) {
            System.out.println(empregado.getNome() + " " + empregado.getSalario());
        }

    }

    public static void sortEmpregados(Empregado[] empregados){
         //TODO
    }
}


