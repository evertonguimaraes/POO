package br.unifor.poo.aulas.aula07.collections.types;

import java.util.EmptyStackException;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by evertonguimaraes on 02/05/17.
 */
public class CollectionsStack {

    public static void main(String[] args) {

        Stack<Number> stack = new Stack<>();

        // Utilizar a operação push para inserir elementos na pilha
        stack.push(2.5);
        stack.push(8.8);
        stack.push(12L);
        stack.push(1234.987);
        stack.push(1234567789);

        System.out.printf("TOP: %s %n", stack.peek().toString());

        // Utilizar a operação pop para remover elementos da pilha
        try{

            Number numberToRemove = null;

            while(!stack.empty()){
                numberToRemove = stack.pop();
                // Imprimir o objeto removido
                System.out.printf("Objeto removido: %s %n ", numberToRemove);
                System.out.printf("A pilha contem: %s (top) %n", stack);
            }
        }catch(EmptyStackException ese){
            ese.printStackTrace();
        }
    }
}
