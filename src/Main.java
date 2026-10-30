import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        Pedido pedido = new Pedido(1,"G. Pires");

        pedido.adicionarItem(new ItemPedido(1, "Notebook", 3500.00, 1));
        pedido.adicionarItem(new ItemPedido(2, "Mouse Sem Fio", 120.00, 2));
        pedido.adicionarItem(new ItemPedido(3, "Teclado Mecânico", 350.00, 1));
        pedido.adicionarItem(new ItemPedido(4, "Monitor 27'", 1400.00, 2));

        System.out.println("--Status do Pedido--");
        pedido.exibirResumoPedido();

        pedido.removerItem(2);

        pedido.exibirResumoOrdenado();
        pedido.exibirResumoPedido();
    }
}