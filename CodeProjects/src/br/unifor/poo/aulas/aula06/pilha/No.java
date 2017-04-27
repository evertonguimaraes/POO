package br.unifor.poo.aulas.aula06.pilha;

/**
 * Created by evertonguimaraes on 27/04/17.
 */


public class No {

    private Object element;
    private No next;

    public No(Object element, No next) {
        this.element = element;
        this.next = next;
    }

    public Object getElement() {
        return element;
    }

    public No getNext() {
        return next;
    }

    public void setNext(No next) {
        this.next = next;
    }
}
