package br.unifor.poo.aulas.aula08.exceptions.mvc;

import br.unifor.poo.aulas.aula08.exceptions.exemplos.User;

/**
 * Created by evertonguimaraes on 11/05/17.
 */
public class View {

    private Controle controle;


    public View(Controle controle) {
        this.controle = controle;
    }

    public void efetuarCadastro(User user){
        String message = controle.conectarBanco(user);
    }
}
