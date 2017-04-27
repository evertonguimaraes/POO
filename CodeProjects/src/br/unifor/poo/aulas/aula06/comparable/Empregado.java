/**
 * Created by evertonguimaraes on 18/04/17.
 */

public class Empregado implements Comparable<Empregado>{

    private String nome;
    private double salario;

    public Empregado(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public int compareTo(Empregado object) {
        Empregado empregado =(Empregado) object ;

        if(this.salario>empregado.salario)
            return 1;
        else{
            if(this.salario<empregado.salario)
                return -1;
            else
                return 0;
        }
    }
}
