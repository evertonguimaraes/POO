package br.unifor.poo.aulas.aula05;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by evertonguimaraes on 28/03/17.
 */
public class Disciplina {

    private int codigo;
    private String descricao;
    private String ementa;
    private int cargaHoraria;

    public Disciplina() {
    }

    public Disciplina(int codigo, String descricao, String ementa, int cargaHoraria) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.ementa = ementa;
        this.cargaHoraria = cargaHoraria;

        if(getTurmas() == null){
            this.turmas = new ArrayList<Turma>();
        }
    }

    private ArrayList<Turma> turmas;

    // TODO Continuar a implementação
    public void addTurma(Turma turma){
        this.turmas.add(turma);
    }

    // TODO Getters and Setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEmenta() {
        return ementa;
    }

    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public ArrayList<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(ArrayList<Turma> turmas) {
        this.turmas = turmas;
    }
}
