package br.unifor.poo.aulas.aula08.exceptions.mvc;

import br.unifor.poo.aulas.aula08.exceptions.creating.NovaException;
import br.unifor.poo.aulas.aula08.exceptions.exemplos.User;

/**
 * Created by evertonguimaraes on 11/05/17.
 */
public class Controle {

    private DAO dao;

    public String conectarBanco(User user){
        String message = "";
        try {
            dao.conectarBanco(user);
        } catch (NovaException e) {
            // TODO Definir a ação para o tratamento de excecao.
            message = e.getMessage();
            e.printStackTrace();
        }finally {
            dao.closeConnection();
        }

        return message;
    }


    private boolean realizarConexao(){
        return false;
    }
}
