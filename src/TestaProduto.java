import java.util.ArrayList;
import java.util.List;

public class TestaProduto {
    public static List<Produto> filtrarPrecoMaximo(List<Produto> produtos, double precoMaximo)  {

        List<Produto> filtrados = new ArrayList<>();

        for (Produto p: produtos){
            if (p.getPreco() <= precoMaximo){
                filtrados.add(p);
            }
        }
        return filtrados;
    }

    static void main(String[] args) {
        List<Produto> ListaProdutos = new ArrayList<>();

        ListaProdutos.add(new Produto(1,"Celular",1999.99));
        ListaProdutos.add(new Produto(2,"Notebook",3579.89));
        ListaProdutos.add(new Produto(3,"TV",345.45));
        ListaProdutos.add(new Produto(4,"Geladeira",1199));
        ListaProdutos.add(new Produto(5,"Fogão",2399.99));

        List<Produto> pagaveisEmParcelas = filtrarPrecoMaximo(ListaProdutos, 2000);

        for (Produto p: pagaveisEmParcelas){
            System.out.println(p.getNome() + " - R$ " + p.getPreco());
        }

    }

}
