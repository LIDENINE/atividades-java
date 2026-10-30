import java.util.ArrayList;
import java.util.List;

public class SubListas {
    public static void main(String[] args){
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int n = 1; n < 11; n++){
            numeros.add(n*10);
        }

        List<Integer> sub = numeros.subList(2,6);
        sub.set(0, 999);

        System.out.println(numeros);

        /*A sublista é como uma cópia rasa (aponta para o objeto original), mas ao contrario
        dela, não cria uma novva instância nem uma nova Referência. A sublista funciona
        como uma "janela" que aponta para um trecho da lista original.
         */
    }
}
