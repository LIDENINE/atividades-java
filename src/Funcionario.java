public class Funcionario{
    private int matricula;
    private String nome;
    private double salario;

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    public int getMatricula(){
        return this.matricula;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public double getSalario(){
        return this.salario;
    }

    public Funcionario(int matricula, String nome, double salario){
        this.matricula = matricula;
        this.nome = nome;
        this.salario = salario;
    }
}
