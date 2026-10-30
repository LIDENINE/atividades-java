import java.util.ArrayList;

public class TestaTarefa {
    public static void main(String[] args){
        ArrayList<Tarefa> tarefas = new ArrayList<>();

        tarefas.add(new Tarefa(1,"Fazer exercicios de Java"));
        tarefas.add(new Tarefa(2,"Fazer a pesquisa de Ciência de Dados"));
        tarefas.add(new Tarefa(3,"Fazer a pesquisa de Banco de Dados"));
        tarefas.add(new Tarefa(4,"Tentar lembrar como que anda"));
        tarefas.add(new Tarefa(2,"Lembrar de fazer essa bosta"));

        Tarefa tarefaBusca = new Tarefa(2,"AINDA NÃO TERMINEI!!!");

        System.out.println(tarefas.indexOf(tarefaBusca));
        System.out.println(tarefas.lastIndexOf(tarefaBusca));
    }
}
