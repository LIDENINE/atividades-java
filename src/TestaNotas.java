import java.util.ArrayList;

public class TestaNotas{
    public static  void main(String[] args){
        ArrayList<Double> notas = new ArrayList<>();

        notas.add(2.1);
        notas.add(3.5);
        notas.add(0.0);
        notas.add(7.1);
        notas.add(6.9);
        notas.add(8.2);
        notas.add(5.3);
        notas.add(9.7);

        notas.removeIf(nota -> nota < 7.0);

        System.out.println(notas);
        System.out.println("Total de alunos aprovados: " + notas.size());
    }
}
