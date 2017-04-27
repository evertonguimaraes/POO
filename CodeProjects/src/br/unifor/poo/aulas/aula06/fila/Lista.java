package br.unifor.poo.aulas.aula06.fila;

/**
 * Created by evertonguimaraes on 18/04/17.
 */


public class Lista implements IFila{


    // Metodos originalmente na classe Lista
    public boolean insertLastPosition(Object x) {
        return false;
    }

    public Object removeFinal() {
        return null;
    }

    public void initialPosition() {

    }

    public Object nextElement() {
        return null;
    }


    // métodos implementados da interface IFila
    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean insertEnd(Object x) {
        return false;
    }

    @Override
    public Object removeBegin() {
        return null;
    }
}
