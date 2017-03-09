package br.unifor.poo.aulas.aula04;

/**
 * Created by evertonguimaraes on 07/03/17.
 */

public class TesteEnum {

   protected DiaSemanaEnum diaSemana;

   public TesteEnum(DiaSemanaEnum diaSemana){
        this.diaSemana = diaSemana;
   }

   public void imprimirMensagemDoDia(){

       switch (diaSemana) {
           case SEGUNDA:
               System.out.println("Segunda da preguica.");
               break;

           case TERCA:
               System.out.println("Aula do PROFESSOOOOOR.");
               break;

           case SEXTA:
               System.out.println("Fim de semana chegando.");
               break;

           case DOMINGO:
               System.out.println("Dia da Família.");
               break;

           default:
               System.out.println("Os outros dias são mais ou menos.");
               break;
       }
   }
}
