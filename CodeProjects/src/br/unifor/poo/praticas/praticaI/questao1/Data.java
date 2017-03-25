package br.unifor.poo.praticas.praticaI.questao1;

/**
 * Created by evertonguimaraes on 25/03/17.
 */
public class Data {

    private int dia;
    private int mes;
    private int ano;

    // Default constructor
    public Data() {

    }

    // Constructor with parameters

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    // Deve retornar a data no formato dd/mm/aaaa
    public String getString(){

        String dataFormatada = String.format("%s / %s / %s",
                Integer.toString(getDia()),
                Integer.toString(getMes()),
                Integer.toString(getAno()));

        return dataFormatada;
    }
}
