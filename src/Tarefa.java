import java.util.Objects;

public class Tarefa {
    private int id;
    private String descricao;

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public Tarefa(int id, String descricao){
        this.id = id;
        this.descricao = descricao;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null | getClass() != obj.getClass()) return false;
        Tarefa outro = (Tarefa) obj;
        return Objects.equals(this.id, ((Tarefa) obj).id);
    }
}
