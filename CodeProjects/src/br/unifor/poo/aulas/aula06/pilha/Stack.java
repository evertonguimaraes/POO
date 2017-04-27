package br.unifor.poo.aulas.aula06.pilha;

/**
 * Created by evertonguimaraes on 27/04/17.
 */
public class Stack extends SpecialList implements IStack{

    public Stack(int size) {
        super(size);
    }

    @Override
    public Object pop() {
        return this.returnEnd();
    }

    @Override
    public void push(Object o) {
        // TODO Sera o primeiro elemento vazio (null)
        this.insertBegin(o);
    }

    @Override
    public Object peek() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return super.isEmpty();
    }
}
