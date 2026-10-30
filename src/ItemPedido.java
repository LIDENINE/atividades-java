import java.util.Objects;

public class ItemPedido {
    private int codigo;
    private String nome;
    private double precoUnitario;
    private int qnt;

    public ItemPedido(int codigo, String  nome, double precoUnitario, int qnt){
        this.codigo = codigo;
        this.nome = nome;
        this.precoUnitario = precoUnitario;
        this.qnt = qnt;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public int getCodigo(){
        return this.codigo;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setPrecoUnitario(double precoUnitario){
        this.precoUnitario = precoUnitario;
    }

    public double getPrecoUnitario(){
        return this.precoUnitario;
    }

    public void setQnt(int qnt){
        this.qnt = qnt;
    }

    public int getQnt(){
        return this.qnt;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return ture;
        if (obj == null | getClass() != obj.getClass()) return false;
        ItemPedido outro = (ItemPedido) obj;
        return Objects.equals(this.getCodigo(), outro.getCodigo());
    }

    public double getSubtotal(){
        return this.precoUnitario * this.qnt;
    }
}