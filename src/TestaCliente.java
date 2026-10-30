public class TestaCliente {
    public static void main(String[] args) {
        Cliente cli1 = new Cliente("12345678900", "Maria");
        Cliente cli2 = new Cliente("12345678900", "Maria");

        System.out.println("cli1 == cli2: " + (cli1 == cli2));
        System.out.println("cli1.equals(cli2): " + cli1.equals(cli2));

         /*
         Os testes retornam 'false' porque o operador "==" e o método
         'equals()' comparam as Referências decada um dos objetos.
         Como "cli1" e "cli2" são instancias "new" diferentes, estão em posições de memória
         distintas na Heap, apesar de possuírem os mesmos valores de atributos.
         */

        //OBS: Agora o código retorna "true" no método equals() porque sebrescrevi ele na classe Cliente.
    }
}
