package br.unifor.poo.praticas.praticaVIII;

/**
 * Created by evertonguimaraes on 16/05/17.
 */
public abstract class Contribuinte {

    protected double rendaBruta;
    protected String nomeContribuinte;


    public Contribuinte() {
        // TODO Implement constructor
    }

    public static Contribuinte [] carregarListaContribuintes() {
        Contribuinte [] listaContribuintes = new Contribuinte[6];

        listaContribuintes[0]=new PessoaFisica("Joao Santos",3000.00,"11111");
        listaContribuintes[1]=new PessoaJuridica("Lojas AA",150000.00,"10055");
        listaContribuintes[2]=new PessoaFisica("Maria Soares",5000.00,"22222");
        listaContribuintes[3]=new PessoaJuridica("Supermercados B",2000000.00,"10066");
        listaContribuintes[4]=new PessoaFisica("Carla Maia",1500.00,"33333");
        listaContribuintes[5]=new PessoaJuridica("Posto XX",500000.00,"10077");

        return listaContribuintes;
    }

    // TODO getters and setters
    public void setNomeContribuinte(String nomeContribuinte) {
        this.nomeContribuinte = nomeContribuinte;
    }

    public String getNomeContribuinte(){
        return nomeContribuinte;
    }

    public double getRendaBruta() {
        return rendaBruta;
    }

    public void setRendaBruta(double rendaBruta) {
        this.rendaBruta = rendaBruta;
    }

    // TODO abstract Methods
    abstract public double calcularImposto() throws Exception;

}
