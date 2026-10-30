import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<ItemPedido> itens = new ArrayList<>();

    public void adicionaItem(ItemPedido novoItem){
        if (!this.itens.contains(novoItem)){
            this.itens.add(novoItem);
        }
    }

    public boolean removerItem(int codigo){
        return this.itens.remove(new ItemPedido(codigo,"",0.0,0));
    }

    public double calcularTotalPedido(){
        double total = 0;
        for (ItemPedido p: this.itens){
            total += p.getSubtotal();
        }
        return total;
    }

    public void exibirResumoOrdenado(){

    }
}
