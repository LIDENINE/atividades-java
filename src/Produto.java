public class Produto {
    private int id;
    private String nome;
    private double preco;

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public double getPreco(){
        return this.preco;
    }

    public Produto(int id, String nome, double preco){
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }
}
