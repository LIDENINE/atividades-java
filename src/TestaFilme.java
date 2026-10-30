import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class TestaFilme {
    public static void main(String[] args){
        ArrayList<Filme> filmes = new ArrayList<>();

        filmes.add(new Filme("Inception", 2010, 8.8));
        filmes.add(new Filme("O Chefão", 1972, 9.2));
        filmes.add(new Filme("Interstellar", 2014, 8.6));
        filmes.add(new Filme("Matrix", 1999, 8.7));
        filmes.add(new Filme("Avatar", 2009, 7.8));

        Collections.sort(filmes);
        System.out.println("\n---Ordenando por notas---");
        for (Filme f: filmes){
            System.out.println(f);
        }

        filmes.sort(Comparator.comparing(Filme::getTitulo));
        System.out.println("\n---Ordenando por título---");
        for (Filme f: filmes){
            System.out.println(f);
        }

        filmes.sort((f1, f2) -> Integer.compare(f1.getAno(), f2.getAno()));
        System.out.println("\n--Ordenando por ano---");
        for (Filme f: filmes){
            System.out.println(f);
        }

    }
}
