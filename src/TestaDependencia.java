import java.util.ArrayList;
import java.util.List;

public class TestaDependencia {
    public static void main(String[] args){
        ArrayList<Cliente> listaClientes = new ArrayList<>();

        listaClientes.add(new Cliente("123","Luiz"));
        listaClientes.add(new Cliente("456","Julia"));
        listaClientes.add(new Cliente("789","Sheila"));

        Cliente clienteBusca = new Cliente("123", "Juliana");

        System.out.println(listaClientes.contains(clienteBusca));
        System.out.println(listaClientes.indexOf(clienteBusca));


    }
}
