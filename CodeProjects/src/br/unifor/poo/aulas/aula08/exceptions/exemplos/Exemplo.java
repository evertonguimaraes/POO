package br.unifor.poo.aulas.aula08.exceptions.exemplos;

import java.time.DateTimeException;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.zip.DataFormatException;

/**
 * Created by evertonguimaraes on 11/05/17.
 */


public class Exemplo {

    public static void main(String[] args) {

        try{
            // TODO Código excepcional
            Date date = new Date(20170321);
        }

        catch (ArrayIndexOutOfBoundsException aiob){
            // TODO do something
        }

        catch (NumberFormatException nfe){
            // TODO do something
        }

        catch (InputMismatchException ime){
            // TODO do something
        }

        catch (DateTimeException dte){

        }

        finally {
            // TODO do something
        }

    }
}
