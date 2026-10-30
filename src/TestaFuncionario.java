import java.lang.reflect.Array;
import java.util.ArrayList;

public class TestaFuncionario{
    public static Funcionario buscarPorMatricula(ArrayList<Funcionario> lista, int matricula){
        for (Funcionario f: lista) {
            if (f.getMatricula() == matricula) {
                return f;
            }
        }
        return null;
    }

    public static  void  main(String[] args){
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Funcionario(1, "Paulo", 5200));
        funcionarios.add(new Funcionario(2, "Pablo", 3600));
        funcionarios.add(new Funcionario(3, "Carlos", 7400));
        funcionarios.add(new Funcionario(4, "CLT", 1621.50));

        Funcionario sortudo = buscarPorMatricula(funcionarios, 4);

        if (sortudo != null) {
            sortudo.setSalario(sortudo.getSalario() * 1.1);
            System.out.println(sortudo.getSalario());
        } else{
            System.out.println("O funcionário não foi encontrado.");
        }
    }
}