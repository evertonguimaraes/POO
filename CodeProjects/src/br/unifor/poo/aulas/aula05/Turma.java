package br.unifor.poo.aulas.aula05;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by evertonguimaraes on 28/03/17.
 */
public class Turma {

    private String codigo;
    private String sala;
    private Date horario;

    private Professor professor;
    private ArrayList<Aluno> alunos;

    public Turma(){
        this.alunos = new ArrayList<Aluno>();
    }

    public boolean isOpen(){
        // TODO
        return false;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void addAluno(Aluno aluno){
        this.alunos.add(aluno);
    }
}
