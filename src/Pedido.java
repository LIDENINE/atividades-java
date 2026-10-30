import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class Pedido {
    private int id;
    private String cliente;
    private List<ItemPedido> itens = new ArrayList<>();

    public Pedido(int id, String cliente){
        this.id = id;
        this.cliente = cliente;
        this.itens = new ArrayList<ItemPedido>();
    }

    public void adicionarItem(ItemPedido item){
        itens.add(item);
    }

    public boolean removerItem(int codigo){
        if (!this.itens.contains(new ItemPedido(codigo,"",0.0,0))){
            System.out.println("Item não encontrado");
            return false;
        }
        System.out.println("\nRemovendo item Nº: " + (this.itens.indexOf(new ItemPedido(codigo,"",0.0,0))+1));
        return this.itens.removeIf(item -> item.getCodigo() == codigo);
    }

    public double calcularTotalPedido(){
        double total = 0;
        for (ItemPedido p: this.itens){
            total += p.getSubtotal();
        }
        return total;
    }

    public void exibirResumoOrdenado(){
        System.out.println("\n---Ordenando por maior subtotal----");
        this.itens.sort(Comparator.comparing(ItemPedido::getSubtotal).reversed());
    }

    public void exibirResumoPedido(){
        System.out.println("==Pedido #" + id + " | Cliente: " + cliente + "===");
        if (itens.isEmpty()){
            System.out.println("O pedido está vazio");
        } else {
            for (ItemPedido item: itens){
                System.out.println(" - " + item);
            }
            System.out.printf("Valor Total: R$ %.2f\n" , calcularTotalPedido());
        }
    }
}
