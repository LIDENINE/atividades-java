import java.util.ArrayList;
import java.util.Arrays;

public class Interoperacoes {
    public static void main(String[] args){
        String[] marcasArray = {"Ford", "Toyota", "Honda"};

        ArrayList<String> listaMarcas = new ArrayList<>(Arrays.asList(marcasArray));

        listaMarcas.add("Reno");
        listaMarcas.add("Tesla");

        listaMarcas.toArray(new String[0]);

        for (String s: listaMarcas){
            System.out.println(s);
        }
    }
}
