import java.util.ArrayList;

public class Itinerario{
    static void main(String[] args) {
        ArrayList<String> cidades = new ArrayList<>();

        cidades.add("São Paulo");
        cidades.add("Rio de Janeiro");
        cidades.add("Curitiba");
        cidades.add("Salvador");
        cidades.add("Fortaleza");
        System.out.println(cidades);

        cidades.remove(1);
        System.out.println(cidades);

        cidades.set(2, "Tóquio");
        System.out.println(cidades);

    for (int c = 0; c < cidades.size(); c++){
        System.out.println("["+ c + "] - " + cidades.get(c));
    }
    }
}
