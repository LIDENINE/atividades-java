import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestaDesempenho {
    public static Double calcularMedia(List<Double> valores){
        if (valores == null | valores.isEmpty()){
            return 0.0;
        }

        double soma = 0.0;

        for (double nota: valores){
            soma += nota;
        }

        return soma / valores.size();
    }

    public static void main(String[] args){
        List<Double> notas = new ArrayList<>();

        notas.add(8.5);
        notas.add(6.0);
        notas.add(9.2);
        notas.add(7.5);
        notas.add(5.8);

        double maior = Collections.max(notas);
        double menor = Collections.min(notas);
        double media = calcularMedia(notas);

        System.out.println("Maior nota: " + maior);
        System.out.println("Menor nota: " + menor);
        System.out.println("Média: " + media);
    }
}
