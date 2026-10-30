import java.util.ArrayList;

public class TestaSobrecarga {
    public static void main(String[] args){
        ArrayList<Tarefa> tarefas = new ArrayList<>();

        tarefas.add(new Tarefa(1,"Fazer exercicios de Java"));
        tarefas.add(new Tarefa(2,"Fazer a pesquisa de Ciência de Dados"));
        tarefas.add(new Tarefa(3,"Fazer a pesquisa de Banco de Dados"));
        tarefas.add(new Tarefa(4,"Tentar lembrar como que anda"));
        System.out.println(tarefas);
        tarefas.remove(0);
        System.out.println(tarefas);
        tarefas.remove(new Tarefa(2,"Vou apagar essa coisa de uma vez por todas!"));
        System.out.println(tarefas);

        //A diferença entre os dois métodos é que quando usamos o indice, o remove retorna o
        // a Referência do Objeto, enquanto no remove(Objeto), o método retorna um valor booleano.

    }
}
